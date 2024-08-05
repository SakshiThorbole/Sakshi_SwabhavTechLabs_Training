package com.aurionpro.homework;

import java.util.*;
import java.io.*;

public class ArraySquares {
	public static void main(String[] args) {
		int temp = 0;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the size of array: ");        
		int size = scanner1.nextInt();                         // storing size of array...
		
		System.out.println("Enter array elements: ");
		int array [] = new int[size];                         // creating array...
		
		for(int i = 0; i < size; i++) {                       // taking array elements as input...
			array[i] = scanner1.nextInt();                    // each element will be readed by using scanner...
		}
		
		System.out.println("Array elements are: " );          // printing array elements...       
		for(int i = 0; i < size; i++) {
			System.out.println(array[i] + "\t");
		}
		
		
		System.out.println("Before Sort: ");                  // before sort...
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		sqauresArrayElements(array);                         // calling method...
		
		System.out.println("");
		System.out.println("After Sort: ");                   // after sort...
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		}
	
	public static void sqauresArrayElements(int array[]) {
		int n = array.length;               // dividing the array into negative and positive part
        
        int k;                   // for finding out positive element in the array.
        
        for (k = 0; k < n; k++) {             
            if (array[k] >= 0)              // positive array hai toh...
                break;
        }  
        
        int i = k - 1;                  // last negative element in the array...
        int j = k;                      // first positive element in the array...
        int ind = 0;                    // Initial index of temporary array...
        
        int[] temp = new int[n];            // creating a temporary array of same input length...
        
        while (i >= 0 && j < n) {       // merges the squares of the negative and positive array.
            if (array[i] * array[i] < array[j] * array[j]) {  // If square of the negative element is less, add it to temp
                temp[ind] = array[i] * array[i];    
                i--;               // first half in reverse manner, because first half contains negative elements
            }
            else {
                temp[ind] = array[j] * array[j];      //positive array ka sqaure...
                j++;   
            }
            ind++;                                  // moving to the next index of temp..
        }
        while (i >= 0) {                   // Copy remaining squares of negative elements to temp...
            temp[ind++] = array[i] * array[i];
            i--;
        }
        while (j < n) {                   // Copy remaining squares of positive elements to temp...
            temp[ind++] = array[j] * array[j];
            j++;
        }
 
        for (int x = 0; x < n; x++)             // copying temporary array into original array
            array[x] = temp[x];
    }
}


