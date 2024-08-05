package com.aurionpro.homework;

import java.util.Scanner;

public class CalAreaTrapezoid {
	public static void main(String[] args) {
		System.out.println("Enter the length of base 1: ");
		Scanner s1 = new Scanner(System.in);
		int lengthBase1 = s1.nextInt();
		
		System.out.println("Enter the length of base 2: ");
		Scanner s2 = new Scanner(System.in);
		int lengthBase2 = s2.nextInt();
		
		System.out.println("Enter the height of Trapezoid: ");
		Scanner s3 = new Scanner(System.in);
		int height = s3.nextInt();
		
		int area = (lengthBase1 + lengthBase2) / 2 * height;
		
		System.out.println("Base 1 length of Trapezoid: " + lengthBase1);
	    System.out.println("Base 2 length of Trapezoid: " + lengthBase2);
	    System.out.println("Height of Trapezoid: " + height);
		System.out.println("The area of Trapezoid is: " + area);	
	}
}
