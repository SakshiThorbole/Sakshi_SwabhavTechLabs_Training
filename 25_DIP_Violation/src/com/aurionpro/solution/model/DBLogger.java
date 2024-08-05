package com.aurionpro.solution.model;

public class DBLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("Logged into database");
		
	}

}
