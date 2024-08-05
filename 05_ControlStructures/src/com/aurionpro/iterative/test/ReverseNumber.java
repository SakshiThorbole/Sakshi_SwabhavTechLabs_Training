package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, remainder, temp, reverse = 0, pow = 0;
		
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		number = scanner1.nextInt();
	
		
		temp = number;
		
		while(number != 0 ) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
	}
		System.out.println(reverse);
	}
}
