/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/

package org.apache.airavata.gfac.impl;

import org.apache.airavata.gfac.core.GFacEngine;
import org.apache.airavata.gfac.core.GFacException;
import org.apache.airavata.gfac.core.config.DataTransferTaskConfig;
import org.apache.airavata.gfac.core.config.GFacYamlConfigruation;
import org.apache.airavata.gfac.core.config.JobSubmitterTaskConfig;
import org.apache.airavata.gfac.core.config.ResourceConfig;
import org.apache.airavata.gfac.core.context.ProcessContext;
import org.apache.airavata.gfac.core.task.Task;
import org.apache.airavata.model.appcatalog.computeresource.DataMovementProtocol;
import org.apache.airavata.model.appcatalog.computeresource.JobSubmissionProtocol;
import org.apache.airavata.model.appcatalog.computeresource.ResourceJobManagerType;
import org.apache.airavata.model.application.io.DataType;
import org.apache.airavata.model.application.io.InputDataObjectType;
import org.apache.airavata.model.application.io.OutputDataObjectType;
import org.apache.airavata.model.process.ProcessModel;
import org.apache.airavata.model.task.TaskModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class GFacEngineImpl implements GFacEngine {
	private static GFacEngineImpl engine;
	Map<JobSubmissionProtocol, Task> jobSubmissionTask;
	Map<DataMovementProtocol, Task> dataMovementTask;
	Map<ResourceJobManagerType, ResourceConfig> resources;


	public GFacEngineImpl() throws GFacException {
		GFacYamlConfigruation config = new GFacYamlConfigruation();
		for (JobSubmitterTaskConfig jobSubmitterTaskConfig : config.getJobSbumitters()) {
			jobSubmissionTask.put(jobSubmitterTaskConfig.getSubmissionProtocol(), null);
		}

		for (DataTransferTaskConfig dataTransferTaskConfig : config.getFileTransferTasks()) {
			dataMovementTask.put(dataTransferTaskConfig.getTransferProtocol(), null);
		}

		for (ResourceConfig resourceConfig : config.getResourceConfiguration()) {
			resources.put(resourceConfig.getJobManagerType(), resourceConfig);
		}
	}

	@Override
	public ProcessContext populateProcessContext(String experimentId, String processId, String gatewayId, String
			tokenId) throws GFacException {
		ProcessContext processContext = new ProcessContext(processId, gatewayId, tokenId);
		processContext.setProcessModel(new ProcessModel());
		// TODO: get process model from app catalog
		// TODO: set datamovement protocol and jobsubmission protocol
		// TODO: set up gatewayResourceProfile.
		// TODO: set RemoteCluster
		return processContext;
	}

	@Override
	public void createTaskChain(ProcessContext processContext) throws GFacException {
		List<InputDataObjectType> processInputs = processContext.getProcessModel().getProcessInputs();
		sortByInputOrder(processInputs);
		List<Task> taskChain = new ArrayList<>();
		if (processInputs != null) {
			for (InputDataObjectType processInput : processInputs) {
				DataType type = processInput.getType();
				switch (type) {
					case STDERR:
						//
						break;
					case STDOUT:
						//
						break;
					case URI:
						// TODO : provide data staging data model
						taskChain.add(dataMovementTask.get(processContext.getDataMovementProtocol()));
						break;
					default:
						// nothing to do
						break;
				}
			}
		}
		taskChain.add(jobSubmissionTask.get(processContext.getJobSubmissionProtocol()));
		List<OutputDataObjectType> processOutputs = processContext.getProcessModel().getProcessOutputs();
		for (OutputDataObjectType processOutput : processOutputs) {
			DataType type = processOutput.getType();
			switch (type) {
				case STDERR:
					break;
				case STDOUT:
					break;
				case URI:
					// TODO : Provide data staging data model
					taskChain.add(dataMovementTask.get(processContext.getDataMovementProtocol()));
					break;
			}
		}

		processContext.setTaskChain(taskChain);
	}


	@Override
	public void executeProcess(ProcessContext processContext) throws GFacException {

	}

	@Override
	public void recoverProcess(ProcessContext processContext) throws GFacException {

	}

	@Override
	public void runProcessOutflow(ProcessContext processContext) throws GFacException {

	}

	@Override
	public void recoverProcessOutflow(ProcessContext processContext) throws GFacException {

	}

	@Override
	public void cancelProcess() throws GFacException {

	}

	/**
	 * Sort input data type by input order.
	 * @param processInputs
	 */
	private void sortByInputOrder(List<InputDataObjectType> processInputs) {
		Collections.sort(processInputs, new Comparator<InputDataObjectType>() {
			@Override
			public int compare(InputDataObjectType inputDT_1, InputDataObjectType inputDT_2) {
				return inputDT_1.getInputOrder() - inputDT_2.getInputOrder();
			}
		});
	}
}
