package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ForNumberPrinyterPattern {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}


