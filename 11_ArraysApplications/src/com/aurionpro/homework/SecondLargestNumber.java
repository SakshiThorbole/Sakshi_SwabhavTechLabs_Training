package com.aurionpro.homework;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array needs to have at least two elements.");
            return;
        }
        
        int[] array = new int[size];
       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
     
        int maximumElement = array[0];
        int secondLargest = Integer.MIN_VALUE;
       
        for (int i = 1; i < size; i++) {
            if (array[i] > maximumElement) {
                maximumElement = array[i];
            }
        }
      
        for (int i = 0; i < size; i++) {
            if (array[i] != maximumElement && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
	
		

	
