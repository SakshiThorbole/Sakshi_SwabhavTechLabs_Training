package com.aurionpro.model;

public class Employee {
	private int employeeID;
	private String name;
	private int salary;
	
//	public Employee() {
//		employeeID = 10;
//		name = "Sakshi";
//		salary = 1000;
//	}
	
	public Employee(int employeeID, String name, int salary) {
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	
	public void displayEmployeeDetails() {
		  System.out.println("Employee Id: "+ this.getEmployeeID());
		  System.out.println("Employee Name: "+ this.getName());
		  System.out.println("Employee Salary: "+ this.getSalary());
		 }
}

