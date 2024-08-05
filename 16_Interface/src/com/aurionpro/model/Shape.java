package com.aurionpro.model;
public interface Shape {
	void area();
	
	default void display() {
		System.out.println("I am Defualt!!");
	}

}
