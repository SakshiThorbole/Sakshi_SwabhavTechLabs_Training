package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ForFactorialNumber {

	public static void main(String[] args) {
		int fact = 1;
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial is: " + fact);

	}

}
