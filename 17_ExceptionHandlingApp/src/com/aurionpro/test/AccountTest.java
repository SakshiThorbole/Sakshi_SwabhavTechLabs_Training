package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.exceptions.InsufficientBalanceException;
import com.aurionpro.model.Account;
import com.aurionpro.model.Voter;

public class AccountTest {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			Random random = new Random();
			int accountNumber = random.nextInt(1000000000);
			
			System.out.println("Enter name: ");
			String name = scanner.next();
			
			System.out.println("Enter balance: ");
			double balance = scanner.nextDouble();
			
			Account account = new Account(accountNumber, name, balance);
			System.out.println(account);
			
			try {
				System.out.println("Select option --> Credit or Debit?");
				System.out.println("1. Credit Amount");
				System.out.println("2. Debit Amount");
				int choice = scanner.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter amount to be credit: ");
					double creditAmount = scanner.nextDouble();
					account.credit(creditAmount);
					break;
					
				case 2:
					System.out.println("Enter amount to be debit: ");
					double debitAmount = scanner.nextDouble();
					account.debit(debitAmount);	
					break;
					
				default:
					System.out.println("Invalid Input!!..");
					break;
				}
			}
				
			catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
