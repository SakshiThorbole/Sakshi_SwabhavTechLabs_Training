package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;
import com.aurionpro.list.model.StudentComparator;
import com.aurionpro.list.model.Studentss;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of your array: ");
		int size = scanner.nextInt();
		  
//		Employee employee[] = new Employee[size];
		
		List<Employee> employee = new ArrayList<Employee>();
		  
		  
		for(int i= 0; i< 3; i++) {
		  System.out.println("Enter Employee Id: ");
		  int id = scanner.nextInt();
		   
		  System.out.println("Enter Name: ");
		  String name = scanner.next();
		   
		  System.out.println("Enter Salary: ");
		  int salary = scanner.nextInt();
		  
		  employee.add(new Employee(id, name, salary));
		}
		
		System.out.println("Not Sorted");
		for(Employee e: employee) {
			System.out.println(e);
		}
		
		Collections.sort(employee, new EmployeeComparator.EmployeeNameComparator());
		
		
		System.out.println("After Sorted");
		for(Employee e: employee) {
			System.out.println(e);
		}
		  
		
	}

}
