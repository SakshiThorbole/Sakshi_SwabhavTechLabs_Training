package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape;
		shape = new Circle(25);
		shape.area();
		
		shape.display();
		
//		Circle circle = new Circle(25);
//		circle.area();
	}

}
