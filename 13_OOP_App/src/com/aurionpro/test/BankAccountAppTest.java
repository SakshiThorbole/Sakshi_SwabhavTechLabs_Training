package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccountApp;

public class BankAccountAppTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		
		BankAccountApp bankAccountApp[] = new BankAccountApp[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter your Name: ");
			String name = scanner.next();
			
			System.out.println("Enter you balance: ");
			double balance = scanner.nextDouble();
			
			System.out.println("Enter your Account Type (savings/current): ");
			String accountType = scanner.next();
			
			bankAccountApp[i] = new BankAccountApp(name, balance, accountType);
		}
		
//		for(int i = 0; i < bankAccountApp.length; i++) {
//			bankAccountApp[i].display();
//		}
		
		BankAccountApp maxBalanceAccount = getMaximumBalanceAccount(bankAccountApp);
		System.out.println("Account with the maximum balance:");
		maxBalanceAccount.display();		
	}
	
	public static BankAccountApp getMaximumBalanceAccount(BankAccountApp accounts[]) {
		if (accounts == null || accounts.length == 0) {
			return null;
		}

		BankAccountApp maxBalanceAccount = accounts[0];

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxBalanceAccount.getBalance()) {
				maxBalanceAccount = accounts[i];
			}
		}

		return maxBalanceAccount;
	}
}
