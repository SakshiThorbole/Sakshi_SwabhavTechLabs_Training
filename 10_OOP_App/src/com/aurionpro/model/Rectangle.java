package com.aurionpro.model;

public class Rectangle {
	private int length;
	private int breadth;
	
	
	public Rectangle() {
		length = 10;
		breadth = 10;
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


//	public void initialize(int l, int b) {
//		length = l;
//		breadth = b;
//	}
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return this.length;
	}
	
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getBreadth() {
		return this.breadth;
	}

//	public void display() {
//		System.out.println("Height =" + length);
//		System.out.println("Width =" + breadth);
//	}
	
	public void calculateArea() {
		
		int result = length * breadth;
		System.out.println("Result =" + result);
	}
}

	

	
