package com.aurionpro.array;

import java.util.Scanner;

public class IntroMultidimensionalArray {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows you want?");
		int rows = scanner.nextInt();
		
		System.out.println("How many columns you want?");
		int columns = scanner.nextInt();
		
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Enter elements: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("matrix isr elements: ");
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}


