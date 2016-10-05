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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private final static Logger logger = LoggerFactory.getLogger(ConnectionFactory.class);

    //static reference to itself
    private static ConnectionFactory instance;

    public static final String EXPCAT_URL = "jdbc:mysql://localhost/airavata_exp_catalog";
    public static final String EXPCAT_USER = "root";
    public static final String EXPCAT_PASSWORD = "";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    private static Connection expCatConnection;

    //private constructor
    private ConnectionFactory() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_CLASS);
        expCatConnection = DriverManager.getConnection(EXPCAT_URL, EXPCAT_USER, EXPCAT_PASSWORD);
    }

    public static ConnectionFactory getInstance() throws SQLException, ClassNotFoundException {
        if(instance == null)
            instance = new ConnectionFactory();
        return instance;
    }

    public Connection getExpCatConnection() throws SQLException {
        return expCatConnection;
    }

}