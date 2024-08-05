package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int result = 0, remainder, temp, pow = 0, number;
		
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		number = scanner1.nextInt();
		
		temp = number;
		
		while(number > 0) {
			pow++;
			number = number / 10;
		}
		
		number = temp;

		while(number != 0 ) {
			remainder = number % 10;
			result = result + (int) Math.pow(remainder, pow);
			number =	number / 10;
	
		}
		if(temp == result) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}




