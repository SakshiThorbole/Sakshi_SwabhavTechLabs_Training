package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ForNumberPrinterTill10 {

	public static void main(String[] args) {
		for(int number = 1; number <= 10; number ++) {
			for(int i = 1; i<= 10; i++) {
				int table = number * i;
				System.out.println(table);
			}
			System.out.println("");
			
		}

		

	}

}
