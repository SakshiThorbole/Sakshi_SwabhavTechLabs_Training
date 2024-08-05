package com.aurionpro.creational.singleton.model;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	
	private DatabaseConnection() {
		System.out.println("Database connection established");
	}
	
	public static DatabaseConnection getInstance() {
		if(instance==null)
			instance = new DatabaseConnection();
		return instance;
	}
	public void status() {
		System.out.println("Successfull");
	}

}
