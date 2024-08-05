package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.DatabaseConnection;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		
		DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.status();

	}

}
