package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class DbConnectionTest {
	public static void main(String args[]) {
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getDepartmentDetails();;
		connection.addDepartment();		
	}
	
}
