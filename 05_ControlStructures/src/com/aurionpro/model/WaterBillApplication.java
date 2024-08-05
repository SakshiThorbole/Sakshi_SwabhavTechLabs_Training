package com.aurionpro.model;

import java.util.Scanner;

public class WaterBillApplication {
	public static void main(String[] args) {
		int meterCharge = 75;
		int charge = 0;
		
		System.out.println("Enter number of units consumed: ");
		Scanner scanner1 = new Scanner(System.in);
		int noOfUnits = scanner1.nextInt();
		
		if(noOfUnits <= 100) {
			charge = noOfUnits * 5;
			int totalWaterBill = charge + meterCharge;
			System.out.println("The total water bill for " + noOfUnits + " units consumed is " + totalWaterBill);
		}
		else if(noOfUnits <= 250) {
			charge = noOfUnits * 10;
			int totalWaterBill = charge + meterCharge;
			System.out.println("The total water bill for " + noOfUnits + " units consumed is " + totalWaterBill);
		}
		else{
			charge = noOfUnits * 20;
			int totalWaterBill = charge + meterCharge;
			System.out.println("The total water bill for " + noOfUnits + "units consumed is " + totalWaterBill);
		}	
	}
}












