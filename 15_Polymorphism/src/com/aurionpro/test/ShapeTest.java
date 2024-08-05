package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape;           //Super class ka khali refernce create kiya...not object
		
		shape = new Circle(25);
		shape.area();
		
		shape = new Rectangle(10, 20);
		shape.area();
		
		
		
//		Circle circle = new Circle(25);
//		circle.area();
//		
//		Rectangle rectangle = new Rectangle(10, 20);
//		rectangle.area();
//		
//		Triangle triangle = new Triangle(2, 8);
//		triangle.area();

	}

}
