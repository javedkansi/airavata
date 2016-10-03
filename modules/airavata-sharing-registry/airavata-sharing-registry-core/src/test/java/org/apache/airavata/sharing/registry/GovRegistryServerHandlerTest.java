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
package org.apache.airavata.sharing.registry;

import junit.framework.Assert;
import org.apache.airavata.sharing.registry.models.*;
import org.apache.airavata.sharing.registry.server.GovRegistryServerHandler;
import org.apache.thrift.TException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GovRegistryServerHandlerTest {
    private final static Logger logger = LoggerFactory.getLogger(GovRegistryServerHandlerTest.class);

    @Test
    public void test() throws TException {
        GovRegistryServerHandler govRegistryServerHandler = new GovRegistryServerHandler();

        //Creating domain
        Domain domain = new Domain();
        String domainId = "test-domain."+System.currentTimeMillis();
        domain.setDomainId(domainId);
        domain.setName(domainId);
        domain.setDescription("test domain description");
        domain.setCreatedTime(System.currentTimeMillis());
        domain.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createDomain(domain));
        Assert.assertTrue(govRegistryServerHandler.getDomains(0, 10).size() > 0);


        //Creating users
        User user1 = new User();
        String userName1 = "test-user-1." + System.currentTimeMillis();
        String userId1 = domainId + ":" + userName1;
        user1.setUserId(userId1);
        user1.setUserName(userName1);
        user1.setDomainId(domainId);
        user1.setCreatedTime(System.currentTimeMillis());
        user1.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createUser(user1));

        User user2 = new User();
        String userName2 = "test-user-2." + System.currentTimeMillis();
        String userId2 = domainId + ":" + userName2;
        user2.setUserId(userId2);
        user2.setUserName(userName2);
        user2.setDomainId(domainId);
        user2.setCreatedTime(System.currentTimeMillis());
        user2.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createUser(user2));

        User user3 = new User();
        String userName3 = "test-user-3." + System.currentTimeMillis();
        String userId3 = domainId + ":" + userName3;
        user3.setUserId(userId3);
        user3.setUserName(userName3);
        user3.setDomainId(domainId);
        user3.setCreatedTime(System.currentTimeMillis());
        user3.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createUser(user3));

        Assert.assertTrue(govRegistryServerHandler.getUsers(domainId, 0, 10).size() > 0);

        // Creating user groups
        UserGroup userGroup1 = new UserGroup();
        String groupName1 = "test-group-1." + System.currentTimeMillis();
        String groupId1 = domainId + ":" + groupName1;
        userGroup1.setGroupId(groupId1);
        userGroup1.setDomainId(domainId);
        userGroup1.setName(groupName1);
        userGroup1.setDescription("test group description");
        userGroup1.setOwnerId(userId1);
        userGroup1.setGroupType(GroupType.MULTI_USER);
        userGroup1.setCreatedTime(System.currentTimeMillis());
        userGroup1.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createGroup(userGroup1));

        UserGroup userGroup2 = new UserGroup();
        String groupName2 = "test-group-2." + System.currentTimeMillis();
        String groupId2 = domainId + ":" + groupName2;
        userGroup2.setGroupId(groupId2);
        userGroup2.setDomainId(domainId);
        userGroup2.setName(groupName2);
        userGroup2.setDescription("test group description");
        userGroup2.setOwnerId(userId2);
        userGroup2.setGroupType(GroupType.MULTI_USER);
        userGroup2.setCreatedTime(System.currentTimeMillis());
        userGroup2.setUpdatedTime(System.currentTimeMillis());

        Assert.assertNotNull(govRegistryServerHandler.createGroup(userGroup2));

        govRegistryServerHandler.addUsersToGroup(Arrays.asList(userId1), groupId1);
        govRegistryServerHandler.addUsersToGroup(Arrays.asList(userId2, userId3), groupId2);
        govRegistryServerHandler.addChildGroupToParentGroup(groupId2, groupId1);

        Assert.assertTrue(govRegistryServerHandler.getGroupMembers(groupId1, 0, 10).size() == 2);
        Assert.assertTrue(govRegistryServerHandler.getGroupMembers(groupId2, 0, 10).size() == 2);


        //Creating permission types
        PermissionType permissionType1 = new PermissionType();
        String permissionName1 = "READ";
        permissionType1.setDomainId(domainId);
        permissionType1.setName(permissionName1);
        permissionType1.setDescription("READ description");
        permissionType1.setCreatedTime(System.currentTimeMillis());
        permissionType1.setUpdatedTime(System.currentTimeMillis());
        String permissionTypeId1 = govRegistryServerHandler.createPermissionType(permissionType1);
        Assert.assertNotNull(permissionTypeId1);

        PermissionType permissionType2 = new PermissionType();
        String permissionName2 = "WRITE";
        permissionType2.setDomainId(domainId);
        permissionType2.setName(permissionName2);
        permissionType2.setDescription("WRITE description");
        permissionType2.setCreatedTime(System.currentTimeMillis());
        permissionType2.setUpdatedTime(System.currentTimeMillis());
        String permissionTypeId2 = govRegistryServerHandler.createPermissionType(permissionType2);
        Assert.assertNotNull(permissionTypeId2);

        //Creating entity types
        EntityType entityType1 = new EntityType();
        String entityType1Name = "Project";
        entityType1.setDomainId(domainId);
        entityType1.setName(entityType1Name);
        entityType1.setDescription("test entity type");
        entityType1.setCreatedTime(System.currentTimeMillis());
        entityType1.setUpdatedTime(System.currentTimeMillis());
        String entityTypeId1 = govRegistryServerHandler.createEntityType(entityType1);
        Assert.assertNotNull(entityTypeId1);

        EntityType entityType2 = new EntityType();
        String entityType2Name = "Experiment";
        entityType2.setDomainId(domainId);
        entityType2.setName(entityType2Name);
        entityType2.setDescription("test entity type");
        entityType2.setCreatedTime(System.currentTimeMillis());
        entityType2.setUpdatedTime(System.currentTimeMillis());
        String entityTypeId2 = govRegistryServerHandler.createEntityType(entityType2);
        Assert.assertNotNull(entityTypeId2);

        //Creating Entities
        Entity entity1 = new Entity();
        entity1.setDomainId(domainId);
        entity1.setEntityTypeId(entityTypeId1);
        entity1.setOwnerId(userId1);
        entity1.setName("Project name");
        entity1.setDescription("Project description");
        Map<String, String> metadataMap = new HashMap<>();
        metadataMap.put("key", "val");
        entity1.setMetadata(metadataMap);
        entity1.setFullText("Project name project description");
        entity1.setCreatedTime(System.currentTimeMillis());
        entity1.setUpdatedTime(System.currentTimeMillis());

        String entityId1 = govRegistryServerHandler.createEntity(entity1);
        Assert.assertNotNull(entityId1);

        Entity entity2 = new Entity();
        entity2.setDomainId(domainId);
        entity2.setEntityTypeId(entityTypeId2);
        entity2.setOwnerId(userId1);
        entity2.setName("Experiment name");
        entity2.setDescription("Experiment description");
        entity2.setParentEntityId(entityId1);
        metadataMap = new HashMap<>();
        metadataMap.put("key", "val");
        entity2.setMetadata(metadataMap);
        entity2.setFullText("Project name project description");
        entity2.setCreatedTime(System.currentTimeMillis());
        entity2.setUpdatedTime(System.currentTimeMillis());

        String entityId2 = govRegistryServerHandler.createEntity(entity2);
        Assert.assertNotNull(entityId2);

        Entity entity3 = new Entity();
        entity3.setDomainId(domainId);
        entity3.setEntityTypeId(entityTypeId2);
        entity3.setOwnerId(userId1);
        entity3.setName("Experiment name");
        entity3.setDescription("Experiment description");
        entity3.setParentEntityId(entityId1);
        metadataMap = new HashMap<>();
        metadataMap.put("key", "val");
        entity3.setMetadata(metadataMap);
        entity3.setFullText("Project name project description");
        entity3.setCreatedTime(System.currentTimeMillis());
        entity3.setUpdatedTime(System.currentTimeMillis());

        String entityId3 = govRegistryServerHandler.createEntity(entity3);
        Assert.assertNotNull(entityId3);
    }
}