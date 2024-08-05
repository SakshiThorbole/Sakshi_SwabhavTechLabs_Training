package com.aurionpro.structural.composite.model;

public class SimpleTask implements ITask {
	private String title;
	
	
	public SimpleTask(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public void setTitle() {
		this.title = title;
		
	}

	@Override
	public void display() {
		System.out.println("Simple Task: " + title);	
	}

}
