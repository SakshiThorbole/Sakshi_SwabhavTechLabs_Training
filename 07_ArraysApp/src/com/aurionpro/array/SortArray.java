package com.aurionpro.array;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int temp;
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
			for(int j = 1; j < array.length; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for(int i = 0; i < size; i++) {
			System.out.println(array[i] + "\t");
		}

	}

}
