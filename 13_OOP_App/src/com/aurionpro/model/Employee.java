package com.aurionpro.model;

public class Employee {
	private int employeeID;
	private String name;
	private int salary;
	
	public Employee() {
		employeeID = 10;
		name = "Sakshi";
		salary = 1000;
	}
	
	public Employee(int e, String n, int s) {
		employeeID = e;
		name = n;
		salary = s;
	}
	
	public void setEmployeeID(int e) {
		employeeID = e;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	public int getSalary() {
		return salary;
	}
}
