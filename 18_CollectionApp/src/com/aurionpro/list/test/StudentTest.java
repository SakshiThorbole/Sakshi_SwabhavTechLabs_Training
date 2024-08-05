package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;

public class StudentTest {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Student> students = new ArrayList<Student>();
		
//		students.add(new Student(1, "sakshi", 80));
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter roll number");
			int rollNumber = scanner.nextInt();
			
			System.out.println("Enter name");
			String name = scanner.next();
			
			System.out.println("Enter percentage");
			int percentage = scanner.nextInt();
			
			students.add(new Student(rollNumber, name, percentage));
			
		}
		
		for(Student student: students) {
			System.out.println(student);
		}
	}
	}


