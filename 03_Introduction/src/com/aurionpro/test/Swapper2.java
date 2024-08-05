package com.aurionpro.test;

import java.util.Scanner;

public class Swapper2 {
	public static void main(String[] args) {
		
		System.out.println("Enter 1st number: ");
		Scanner s1 = new Scanner(System.in);
		int number1 = s1.nextInt();
		
		System.out.println("Enter 2nd number: ");
		Scanner s2 = new Scanner(System.in);
		int number2 = s2.nextInt();
		
		System.out.println("Before Swapping number1: " + number1  + " and number2: " + number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After Swapping number1: " + number1  + " and number2: " + number2);
	}
}
