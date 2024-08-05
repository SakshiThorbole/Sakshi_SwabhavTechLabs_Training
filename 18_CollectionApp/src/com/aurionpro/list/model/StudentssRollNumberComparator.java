package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentssRollNumberComparator implements Comparator<Studentss> {
	
	public int compare(Studentss student1, Studentss student2) {
		
		if(student1.getRollNumber() > student2.getRollNumber())
			return 1;
		
		if(student1.getRollNumber() < student2.getRollNumber())
			return -1;
		return 0;
	
	}

}
