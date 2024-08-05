package com.aurionpro.model;

public class Reference {
	public Reference() {                             //Default Constructor
		System.out.println("Inside Constructor");
		
	}
	
	public void print() {                             //Non static method
		System.out.println("Inside reference");
	}
	
	public static void staticPrint() {                         //Static method
		System.out.println("Inside static reference");
	}

}
