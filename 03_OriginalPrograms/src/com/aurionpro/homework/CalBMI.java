package com.aurionpro.homework;

import java.util.Scanner;

public class CalBMI {
	public static void main(String[] args) {
		System.out.println("Enter your weight in kilograms: ");
		Scanner s1 = new Scanner(System.in);
		double weight = s1.nextDouble();
		
		System.out.println("Enter the height in meters: ");
		Scanner s2 = new Scanner(System.in);
		double height = s2.nextDouble();
		
		double BMI = weight / (height * height);
		
		System.out.println("Your BMI is: " + BMI);
	}
}
