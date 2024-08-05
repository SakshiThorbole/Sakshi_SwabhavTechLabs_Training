package com.aurionpro.homework;

import java.util.Scanner;

public class HeightRideApp {

	public static void main(String[] args) {
		int charge = 0;
		System.out.println("Enter your height in centimeters: ");
		Scanner scanner1 = new Scanner(System.in);
		int height = scanner1.nextInt();
		
		if(height < 120) {
			System.out.println("Can't ride");
		}
	
		if(height > 120) {
			System.out.println("Can ride");
			
			System.out.println("Enter your age: ");
			Scanner scanner2 = new Scanner(System.in);
			int age = scanner2.nextInt();
			
			if(age < 12) {
				charge += 5;
			}
			else if(age >= 12 && age < 18) {
				charge += 7;
			}
			else if(age >= 18 && age < 45) {
				charge += 12;
			}
			else if(age >= 45 && age <= 55) {
				charge += 0;
			}

		System.out.println("Want photos --> yes OR no?");
		Scanner scanner3 = new Scanner(System.in);
		String answer = scanner3.nextLine();
				
			if(answer.equals("yes")) {
				charge += 3;
				System.out.println("The total bill for ride is: " + charge + "$");
			}
			else {
				System.out.println("The total bill for ride is: " + charge + "$");
			}	
		}

	}

}
