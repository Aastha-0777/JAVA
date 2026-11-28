package com.psm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Database Connection
public class DBConnection {

	// 1. Make Credential

	private static final String URLNAME = "jdbc:mysql://localhost:3306/retail_db";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver"; // Driver class fetched form jdbc jar
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	// 2. getConnection() Method

	public static Connection getConnectionMy() throws SQLException {
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
	}

}
