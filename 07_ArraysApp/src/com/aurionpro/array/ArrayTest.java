package com.aurionpro.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int sum = 0;
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
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		
		

	}

}
