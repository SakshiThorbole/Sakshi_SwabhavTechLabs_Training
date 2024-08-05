package com.aurionpro.violation.model;

public class Rectangle {
	private int height;
	private int width;
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public int getArea() {
		return width*height;
	}

}
