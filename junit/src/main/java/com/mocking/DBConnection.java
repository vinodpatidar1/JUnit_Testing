package com.mocking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection dbConnection;

	public void getDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_maven_db", "root", "root");
	}

	public int executeQuery(String query) throws ClassNotFoundException, SQLException {
		return dbConnection.createStatement().executeUpdate(query);
	}
}