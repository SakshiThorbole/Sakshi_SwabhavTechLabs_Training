package com.aurionpro.homework;

import java.util.Scanner;

public class ProductOfElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] product = createProductArray(array);

        System.out.println("Product array:");
        for (int p : product) {
            System.out.print(p + " ");
        }
    }

    public static int[] createProductArray(int[] array) {
        int n = array.length;

        if (n == 0) {
            return new int[0];
        }

        int[] product = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
      
        left[0] = 1;                            // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            left[i] = array[i - 1] * left[i - 1];
        }

        right[n - 1] = 1;                      // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            right[i] = array[i + 1] * right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }
        return product;
	}
}

