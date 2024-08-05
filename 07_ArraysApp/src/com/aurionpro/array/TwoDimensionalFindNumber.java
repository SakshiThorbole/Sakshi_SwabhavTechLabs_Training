package com.aurionpro.array;

import java.util.Scanner;

public class TwoDimensionalFindNumber {

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
		
		System.out.println("Enter the element you want to search ");
		int number = scanner.nextInt();
		
		boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Number " + number + " is present in the array.");
        } else {
            System.out.println("Number " + number + " is not present in the array.");
        }
		

	}

}
