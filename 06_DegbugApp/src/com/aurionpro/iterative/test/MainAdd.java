package com.aurionpro.iterative.test;

import java.util.Scanner;

public class MainAdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		int result = addition(number1, number2);
		int resultSub = subtraction(number1, number2);
		
		System.out.println("Addition is: " + result);
		
		System.out.println("Subtraction is: " + resultSub);

	}
	private static int addition(int number1, int number2) {
		return number1 + number2;
	}
	private static int subtraction(int number1, int number2) {
		return number1 - number2;
	}
}
