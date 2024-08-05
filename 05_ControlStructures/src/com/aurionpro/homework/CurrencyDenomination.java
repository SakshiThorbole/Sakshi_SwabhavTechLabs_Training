package com.aurionpro.homework;

import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {
		System.out.println("Enter a amount which should be multiple of 100: ");
		Scanner scanner1 = new Scanner(System.in);
		int amount = scanner1.nextInt();
		
		int[] denominations = {2000, 500, 200, 100};
		
		if(amount > 50000) {
			System.out.println("Exceeds the Withdrawal Amount.");
		}
		else if(amount % 100 != 0) {
			System.out.println("Amount should be multiple of 100.");
		}
		else {
			int[] noteCounter = new int[denominations.length];
			
			for(int i = 0; i < denominations.length; i++) {
				if(amount >= denominations[i]) {
					noteCounter[i] = amount / denominations[i];
					amount = amount - noteCounter[i] * denominations[i];
				}
			}		
		System.out.println("Currency notes required: ");
		for(int i = 0; i < denominations.length; i++) {
			System.out.println(denominations[i] + " : " + noteCounter[i]);
			}
		}
	}
}
		

