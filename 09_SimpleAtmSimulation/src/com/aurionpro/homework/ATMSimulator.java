package com.aurionpro.homework;

import java.util.Scanner;

public class ATMSimulator {

	public static void main(String[] args) {
		double balance = 1000;
		
		while(true) {
	
		System.out.println("Choose any an option: 1. Check Balance OR 2. Deposit Money OR 3.Withdraw Money OR 4. Exit" );
		Scanner scanner1 = new Scanner(System.in);
		int option = scanner1.nextInt();
		
		switch(option) {
		case 1: 
			System.out.println("Your current balance is: " + balance);
			break;
			
		case 2:
			System.out.println("Enter amount to be deposited:");
			Scanner scanner2 = new Scanner(System.in);
			double deposit = scanner2.nextDouble();
			
			if(deposit > 0) {
				balance = balance + deposit;
				System.out.println("You have deposited " + deposit);
				System.out.println("Your new balance is: " + balance);
			}
			else {
                System.out.println("Invalid amount. Please enter a positive number.");
            }
            break;
			
		case 3:
			System.out.print("Enter amount to withdraw: ");
			Scanner scanner3 = new Scanner(System.in);
            double withdraw = scanner3.nextDouble();
            if (withdraw > 0 && withdraw <= balance) {
            	balance = balance - withdraw;
            	System.out.println("You have withdrawn " + withdraw);
				System.out.println("Your new balance is: " + balance);
            }
            else if (withdraw > balance) {
                System.out.println("Insufficient balance. Please enter a smaller amount.");
            }
            break;
            
		case 4:
			System.out.println("Thank you for using the ATM. Goodbye!");
			System.exit(0);
            break;
        default:
            System.out.println("Invalid input. Please select a correct option.");
		}
		}
	}
}


