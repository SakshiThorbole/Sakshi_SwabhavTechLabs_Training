package com.aurionpro.list.model;

public class Studentss {

	private int rollNumber;
	private String name;
	private int percentage;
	

	public Studentss(int rollNumber, String name, int percentage) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
		// TODO Auto-generated constructor stub
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentTest [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
