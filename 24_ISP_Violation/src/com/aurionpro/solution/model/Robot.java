package com.aurionpro.solution.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot started the work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stoped the work");
		
	}

}
