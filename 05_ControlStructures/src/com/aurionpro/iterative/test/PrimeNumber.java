package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int temp = 0, i = 2;
	
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		while(i <= number) {
			if(number % i == 0) {
				temp = temp + 1;
			}
			i++;
		}
		if(temp > 0) {
			System.out.println("nOT PRIME");
		}
		else {
			System.out.println("Prime");
		}
	}
}

