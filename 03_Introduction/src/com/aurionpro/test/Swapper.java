package com.aurionpro.test;

public class Swapper {
	public static void main(String[] args) {
		int number1 = 10, number2 = 20;
		
		System.out.println("Before Swapping: " + number1  + " " + number2);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swapping: " + number1  + " " + number2);

	}

}
