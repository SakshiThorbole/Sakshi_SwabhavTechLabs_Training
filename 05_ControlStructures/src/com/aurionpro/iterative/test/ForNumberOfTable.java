package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ForNumberOfTable {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner scanner1 = new Scanner(System.in);
		int number = scanner1.nextInt();
		
		for(int i = 1; i<= 10; i++) {
			System.out.println(+ number + "*" + i + "=" + number*i );
		}

	}

}
