package com.aurionpro.creational.prototype.model;

public class Circle implements IShape {
	private String color;
	 
	
    public Circle(String color) {
        this.color = color;
    }
 
   
    @Override
    public IShape clone() {
        return new Circle(this.color);
    }
 
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }
}


