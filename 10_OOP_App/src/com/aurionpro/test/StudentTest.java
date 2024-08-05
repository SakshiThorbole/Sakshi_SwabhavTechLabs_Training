package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rollNo of student1: ");
		int r = scanner.nextInt();		
//		student.setRollNumber(r);
		
		System.out.println("Enter name of student1: ");
		String n = scanner.next();		
//		student.setName(n);
				
		System.out.println("Enter age of student1: ");
		int a = scanner.nextInt();		
//		student.setAge(a);
		
		System.out.println("Enter percentage of student1: ");
		int p = scanner.nextInt();		
//		student.setPercentage(p);
		
		System.out.println("RollNumber of Student 1: " + student.getRollNumber());
		System.out.println("Name of Student 1: " + student.getName());
		System.out.println("Age of Student 1: " + student.getAge());
		System.out.println("Percentage of Student 1: " + student.getPercentage());
		
		
		Student student1 = new Student(r, n, a, p);
		
		System.out.println("Enter rollNo of student2: ");
		scanner.nextInt();
//		student.setRollNumber(r);
		
		System.out.println("Enter name of student2: ");
		scanner.next();
//		student.setName(n);
		
		System.out.println("Enter age of student3: ");
		scanner.nextInt();
//		student.setAge(a);
		
		System.out.println("Enter percentage of student4: ");
		scanner.nextInt();
//		student.setPercentage(p);
		
		System.out.println("RollNumber of Student 2: " + student.getRollNumber());
		System.out.println("Name of Student 2: " + student.getName());
		System.out.println("Age of Student 2: " + student.getAge());
		System.out.println("Percentage of Student 2: " + student.getPercentage());

	}

}
