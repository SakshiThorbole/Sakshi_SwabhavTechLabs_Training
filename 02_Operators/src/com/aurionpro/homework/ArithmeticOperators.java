package com.aurionpro.homework;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		System.out.println("Enter 1st number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Enter 2nd number:");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		System.out.println("Choose: 1. Add OR 2. Sub OR 3. Mul OR 4. Div OR 5. Mod");
		Scanner s3 = new Scanner(System.in);
		int ch = s3.nextInt();
		
		switch(ch) {
		
		case 1:
			System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
			break;
			
		case 2:
			System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
			break;
			
		case 3:
			System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
			break;
			
		case 4:
			System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
			break;
			
		case 5:
			System.out.println("Division of " + a + " and " + b + " is: " + (a % b));
			break;
			
			
			default:
				System.out.println("Invalid Input!!");
		}		
	}
}

