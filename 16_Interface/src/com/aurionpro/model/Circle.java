package com.aurionpro.model;

public class Circle implements Shape {
	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle is: " + 3.14*radius*radius);		
		
	}
//	public void display() {
//		System.out.println("I am Defualt of Circle!!");
//	}
}
