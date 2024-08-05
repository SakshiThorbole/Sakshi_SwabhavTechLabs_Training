package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CalculateSumOfDigits {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		while(number > 0) {
		int rem = number % 10;
		sum = sum + rem;
		number = number / 10;
		}
		
		System.out.println(number);
		
		
	}

}
