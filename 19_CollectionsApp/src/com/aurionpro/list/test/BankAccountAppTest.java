package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.BankAccountApp;

public class BankAccountAppTest {

	public static void main(String[] args) {
		
		List<BankAccountApp> accounts = new ArrayList<BankAccountApp>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of accounts you want to create?");
		int number = scanner.nextInt();
		
		for(int i = 0; i < number; i++) {
			
			System.out.println("Enter your name: ");
			String name = scanner.next();
			
			System.out.println("Enter your balance: ");
			double balance = scanner.nextDouble();
			
			System.out.println("Enter the account type: Savings or Current? ");
			String accountType = scanner.next();
			
			accounts.add(new BankAccountApp(name, balance, accountType));			
		}
		
		System.out.println("Accounts sorted by balance in descending order:");
		
		List<BankAccountApp> sortedAccounts = sortAccountsByBalanceDescending(accounts);
		for(BankAccountApp account: sortedAccounts) {
			System.out.println(account);
		}		
	}
	
	private static List<BankAccountApp> sortAccountsByBalanceDescending(List<BankAccountApp> accounts){
		List<BankAccountApp> sortedAccounts = new ArrayList<BankAccountApp>();
		
		while(!accounts.isEmpty()) {
			BankAccountApp maximumBalanceAccount = accounts.get(0);
			for(BankAccountApp account: accounts) {
				if(account.getBalance() > maximumBalanceAccount.getBalance()) {
					  maximumBalanceAccount = account;
				}
			}
			sortedAccounts.add(maximumBalanceAccount);
			accounts.remove(maximumBalanceAccount);
		}
		
		return sortedAccounts;
	}
	
}


// Sirf maximum balance account display karna hota toh...

//BankAccountApp accountWithMaximumBalance = findAccountWithMaximumBalance(accounts);
//System.out.println("Account with Maximum Balance is: " + accountWithMaximumBalance);


//private static BankAccountApp findAccountWithMaximumBalance(List<BankAccountApp> accounts) {
//	
//	if (accounts == null || accounts.size() == 0) {
//		return null;
//	}
//	
//	BankAccountApp maximumBalanceAccount = accounts.get(0);
//	
//	for(BankAccountApp account: accounts) {
//		if(account.getBalance() > maximumBalanceAccount.getBalance()) {
//			 maximumBalanceAccount = account;			
//		}
//	}
//	return maximumBalanceAccount;
//}
