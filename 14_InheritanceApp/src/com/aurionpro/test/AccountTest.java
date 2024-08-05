package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		CurrentAccount currentAccount = new CurrentAccount(1234567890, "Sakshi", 1500, 500);
		SavingsAccount savingsAccount = new SavingsAccount(1234567890, "Thorbole", 2500, 1000);
		
		
		System.out.println("Current Account Details:");
        currentAccount.displayDetails();
        
        System.out.println("Savings Account Details:");
        savingsAccount.displayDetails();

	}

}
