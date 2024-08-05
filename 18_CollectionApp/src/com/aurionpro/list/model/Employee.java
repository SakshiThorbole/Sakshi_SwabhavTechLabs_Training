package com.aurionpro.list.model;

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
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

