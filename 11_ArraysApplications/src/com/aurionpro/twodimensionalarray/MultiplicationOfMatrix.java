package com.aurionpro.twodimensionalarray;

import java.util.Scanner; 

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows you want?");
		int rows = scanner.nextInt();
		
		System.out.println("Enter the number of columns you want?");
		int columns = scanner.nextInt();
		
		System.out.println("Enter the elements of matrix1: ");
		int[][] matrix1 = readMatrix(rows, columns);
				
	    System.out.println("Enter the elements of matrix2: ");
		int[][] matrix2 = readMatrix(rows, columns);
		
		int[][] result = multiplyMatrix(matrix1, matrix2);
		
		System.out.println("The resultant matrix after addition is:");
        printMatrix(result);
	}
		
	 public static int[][] readMatrix(int rows, int columns) {
		 Scanner scanner = new Scanner(System.in);
		 int[][] matrix = new int[rows][columns];
		 
			for(int i = 0; i < rows; i++) {
		    	for(int j = 0; j < columns; j++) {
		    		matrix[i][j] = scanner.nextInt(); 
		    	}
			}
			return matrix;
	 }
	 public static void printMatrix(int matrix[][]) {
		 for(int i = 0; i < matrix.length; i++) {
			 for(int j = 0; j < matrix[i].length; j++) {
				 System.out.print(matrix[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	 public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		 int rows = matrix1.length;
		 int columns = matrix1[0].length;
		 
		 int[][] result = new int[rows][columns];
		 
		 for(int i = 0; i  < rows; i++) {
			 for(int j = 0; j < columns; j++) {
				 result[i][j] = matrix1[i][j] * matrix2[i][j];
			 }
		 }
		 return result;		 
	 }
	 
}

		    
