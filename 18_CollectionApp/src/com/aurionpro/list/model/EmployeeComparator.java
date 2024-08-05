package com.aurionpro.list.model;

import java.util.Comparator;

public class EmployeeComparator {
	public static class EmployeeIDComparator implements Comparator<Employee> {
		
		public int compare(Employee employee1, Employee employee2) {
			
			if(employee1.getEmployeeID() > employee2.getEmployeeID())
				return 1;
			
			if(employee1.getEmployeeID() < employee2.getEmployeeID())
				return -1;
			return 0;
		
		}

	}
	public static class EmployeeNameComparator implements Comparator<Employee> {
		
		public int compare(Employee employee1, Employee employee2) {
			if(employee1.getName().compareTo(employee2.getName()) > 0)
				return 1;
			
			if(employee1.getName().compareTo(employee2.getName()) < 0)
				return -1;
			
			return 0;	

			
		}
	}
	
	

}
