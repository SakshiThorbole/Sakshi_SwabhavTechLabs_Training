package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee ID of Employee 1: ");
		int e = scanner.nextInt();
//		employee.setEmployeeID(e);
		
		System.out.println("Enter Name of Employee 1: ");
		String n = scanner.next();
//		employee.setName(n);
		
		System.out.println("Enter Salary of Employee 1: ");
		int s = scanner.nextInt();
//		employee.setSalary(s);
		
		System.out.println("Employee ID is: " + employee.getEmployeeID());
		System.out.println("Employee Name is: " + employee.getName());
		System.out.println("Employee Salary is: " + employee.getSalary());
		
		Employee employee1 = new Employee();
		
		System.out.println("Enter Employee ID of Employee 2: ");
		e = scanner.nextInt();
//		employee.setEmployeeID(e);
		
		System.out.println("Enter Name of Employee 2: ");
		n = scanner.next();
//		employee.setName(n);
		
		System.out.println("Enter Salary of Employee 2: ");
		s = scanner.nextInt();
//		employee.setSalary(s);
		
		System.out.println("Employee ID is: " + employee.getEmployeeID());
		System.out.println("Employee Name is: " + employee.getName());
		System.out.println("Employee Salary is: " + employee.getSalary());
		

	}

}
