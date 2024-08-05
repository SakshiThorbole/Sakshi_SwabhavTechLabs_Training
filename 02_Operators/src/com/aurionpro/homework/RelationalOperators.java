package com.aurionpro.homework;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		System.out.println("Enter 1st number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println("Enter 2nd number:");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		
		System.out.println("Choose: 1. Greater then OR 2. Less then OR 3. Greater then equal to OR 4. Less then equal to OR 5. Equal to Equal to OR 6. Not equal to");
		Scanner s3 = new Scanner(System.in);
		int ch = s3.nextInt();
		
		switch(ch) {
		
		case 1:
			System.out.println("a > b: " + (a > b));
			break;
			
		case 2:
			System.out.println("a < b: " + (a < b));
			break;
			
		case 3:
			System.out.println("a >= b: " + (a >= b));
			break;
			
		case 4:
			System.out.println("a <= b: " + (a <= b));
			break;
			
		case 5:
			System.out.println("a == b: " + (a == b));
			break;
			
		case 6:
			System.out.println("a != b: " + (a != b));
			break;
			
			
			default:
				System.out.println("Invalid Input!!");
		}		
	}
}
