package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.list.model.StudentComparator;
import com.aurionpro.list.model.Studentss;
import com.aurionpro.list.model.StudentssNameComparator;
import com.aurionpro.list.model.StudentssRollNumberComparator;

public class StudentssTest {

	public static void main(String[] args) {
		
		List<Studentss> students = new ArrayList<Studentss>();
		
		students.add(new Studentss(2, "Sakshi", 90));
		students.add(new Studentss(3, "Thorbole", 80));
		students.add(new Studentss(1, "Sonu", 80));
		
		
		System.out.println("Not Sorted");
		for(Studentss student: students) {
			System.out.println(student);
		}
		
//		Collections.sort(students, new StudentssRollNumberComparator());
//		Collections.sort(students, new StudentssNameComparator());
		
		Collections.sort(students, new StudentComparator.StudentssNameComparator());
		
		
		System.out.println("After Sorted");
		for(Studentss student: students) {
			System.out.println(student);
		}
		
		

	}

}
