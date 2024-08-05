package com.aurionpro.array;

import java.util.Scanner;

public class ArrayFindNumber {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner1.nextInt();
		int array[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			array[i] = scanner1.nextInt();
		}
		System.out.println("Array is: ");
		for(int i = 0; i < size; i++) {
			System.out.println(array[i] + "\t");
		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int guessedNumber = scanner2.nextInt();
		
		boolean check = false;
		
	
		for(int i = 0; i < array.length; i++) {
			if(guessedNumber == array[i]) {
				check =  true;
				break;
			}
			else {
				check = false;
			}
		}
		if(check == true) {
			System.out.println("The number is present");
		}
		else {
			System.out.println("The number is not present");
		}
		
		
	}

}
