package com.aurionpro.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private int percentage;
	
	public Student() {
		rollNumber = 10;
		name = "Sakshi";
		age = 10;
		percentage = 50;
	}
	
	public Student(int r, String n, int a, int p) {
		rollNumber = r;
		name = n;
		age = a;
		percentage = p;
	}
	
	public void setRollNumber(int r) {
		rollNumber = r;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPercentage(int p) {
		percentage = p;
	}
	
	public int getPercentage() {
		return percentage;
	}
}
