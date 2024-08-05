package com.aurionpro.violation.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Worker started the work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Worker stoped the work");
		
	}

	@Override
	public void eat() {
		System.out.println("Worker started eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Worker started drinking");
		
	}

}
