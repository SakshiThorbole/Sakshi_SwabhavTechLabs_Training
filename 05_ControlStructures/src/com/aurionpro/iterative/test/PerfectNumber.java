package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int temp = 0, sum  = 0;
		
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		int i = 0;
		while(i <= (number / 2)) {
			if(number % i == 0) {
				sum = sum + i;
				i++;
			}
			if(sum == number) {
				
			}
		}
		

	}

}
