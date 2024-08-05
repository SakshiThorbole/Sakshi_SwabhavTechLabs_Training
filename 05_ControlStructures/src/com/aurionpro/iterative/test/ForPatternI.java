package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ForPatternI {

	public static void main(String[] args) {
		int k = 1;
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(k+ " ");
				k++;
			}
			System.out.println();
		}
	}
}
		



