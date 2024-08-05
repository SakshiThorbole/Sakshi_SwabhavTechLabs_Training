package com.aurionpro.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot started the work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stoped the work");
		
	}

	@Override
	public void eat() {
		System.out.println("Robot started eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Robot started drinking");
		
	}

}
