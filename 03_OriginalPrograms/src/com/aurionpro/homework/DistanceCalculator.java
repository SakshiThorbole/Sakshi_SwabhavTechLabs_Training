package com.aurionpro.homework;

import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		System.out.println("Enter x1 point: ");
		Scanner s1 = new Scanner(System.in);
		double x1 = s1.nextDouble();
		
		System.out.println("Enter x2 point: ");
		Scanner s2 = new Scanner(System.in);
		double x2 = s2.nextDouble();
		
		System.out.println("Enter y1 point: ");
		Scanner s3 = new Scanner(System.in);
		double y1 = s3.nextDouble();
		
		System.out.println("Enter y2 point: ");
		Scanner s4 = new Scanner(System.in);
		double y2 = s4.nextDouble();
		
		double distance = calculateDistance(x1, y1, x2, y2);
		
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
	}
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}


