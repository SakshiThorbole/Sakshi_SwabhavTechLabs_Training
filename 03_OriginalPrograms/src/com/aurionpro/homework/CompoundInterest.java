package com.aurionpro.homework;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		System.out.println("Enter the principal amount: ");
		Scanner s1 = new Scanner(System.in);
		int principalAmount = s1.nextInt();
		
		System.out.println("Enter the rate of interest: ");
		Scanner s2 = new Scanner(System.in);
		int rateOfInterest = s2.nextInt();
		
		System.out.println("Enter the time period: ");
		Scanner s3 = new Scanner(System.in);
		int timePeriod = s3.nextInt();
		
		double compoundInterest = principalAmount * (1 + rateOfInterest / 100)^timePeriod;
		
		System.out.println("Principal: " + principalAmount);
	    System.out.println("Interest Rate: " + rateOfInterest);
	    System.out.println("Time Duration: " + timePeriod);
		System.out.println("The compound interest is: " + compoundInterest);
	}

}
