package com.aurionpro.homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArraysPeakElementFinder {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the size of array: ");        
		int size = scanner1.nextInt();                         
		
		System.out.println("Enter array elements: ");
		int array [] = new int[size];                         
		
		for(int i = 0; i < size; i++) {                       
			array[i] = scanner1.nextInt();                    
		}
		
		int peakIndex = findPeakElement(array);
		
		if(peakIndex != -1) {
			System.out.println("Peak element found at index: " + peakIndex + ", Value: " + array[peakIndex]);
		}
		else {
			System.out.println("No peak element found");
		}
	}
	public static int findPeakElement(int[] array) {
		int n =  array.length;
		for(int i = 0; i < n; i++) {
			if((i == 0 || array[i] >= array[i - 1]) && (i == n - 1 || array[i] >= array[i + 1])) {
				return i;
			}
		}
		return -1;
	}

}
