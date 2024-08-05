package com.aurionpro.model;

public class Box {
	public int width;
	public int height;
	public int depth;
	
	public Box() {
		width = 10;
		height = 10;
		depth = 10;
	}
	
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
//	public void initialize(int h, int w, int d) {
//		height = h;
//		width = w;
//		depth = d;
//	}
	
	public void display() {
		System.out.println("Height =" + height);
		System.out.println("Width =" + width);
		System.out.println("Depth =" + depth);
	}

}
