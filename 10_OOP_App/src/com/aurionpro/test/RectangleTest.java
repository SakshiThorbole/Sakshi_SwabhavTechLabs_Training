package com.aurionpro.test;

import com.aurionpro.model.Box;
import com.aurionpro.model.Rectangle;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();    
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length for Rectangle: ");
		int l = scanner.nextInt();
		
//		rectangle.setLength(l);
		
		System.out.println("Enter breadth for Reactangle: ");
		int b = scanner.nextInt();
		
//		rectangle.setBreadth(b);
		
		System.out.println("Length for Reactangle 1: " + rectangle1.getLength());
		System.out.println("Breadth for Reactangle 1: " + rectangle1.getBreadth());
		
//		rectangle.calculateArea();
		
		
		System.out.println("For Rectangle 2");
		
		Rectangle reactangle2 = new Rectangle(l, b);
		
		
		System.out.println("Enter length for Reactangle 2: ");
		l = scanner.nextInt();
		
//		rectangle2.setLength(l);
		
		System.out.println("Enter breadth for Reactangle 2: ");
		b = scanner.nextInt();
		
//		rectangle.setBreadth(b);
		
		System.out.println("Length for Reactangle 2: " + reactangle2.getLength());
		System.out.println("Breadth for Reactangle 2: " + reactangle2.getBreadth());
		
//		rectangle.calculateArea();
		

	}

}
