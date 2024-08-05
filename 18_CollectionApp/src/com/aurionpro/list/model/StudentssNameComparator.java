package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentssNameComparator implements Comparator<Studentss>{

	@Override
	public int compare(Studentss student1, Studentss student2) {
		if(student1.getName().compareTo(student2.getName()) > 0)
			return 1;
		
		if(student1.getName().compareTo(student2.getName()) < 0)
			return -1;
		
		return 0;		
	}
}
