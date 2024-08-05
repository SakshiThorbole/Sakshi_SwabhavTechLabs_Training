package com.aurionpro.homework;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		System.out.println(a > 0 && a < 100);
		System.out.println(a > 0 || a < 100);
		System.out.println(!(a > 1 && a < 150));
		
	}
}
