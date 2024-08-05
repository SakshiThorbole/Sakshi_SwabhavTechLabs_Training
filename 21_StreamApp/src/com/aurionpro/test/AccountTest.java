package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(new Account(123456789, "Sakshi", 5000));
		accounts.add(new Account(123456788, "Sonu", 400));
		accounts.add(new Account(123456787, "Adi", 3000));
		
		Optional<Account> minimumBalanceAccount = accounts.stream().min((account1, account2) -> Double.compare(account1.getBalance(), account2.getBalance()));
		
		if(minimumBalanceAccount.isPresent()) {
			System.out.println("Account with minimum balance is: " + minimumBalanceAccount.get());
		}
		
		Optional<Account> maximumBalanceAccount = accounts.stream().max((account1, account2) -> Double.compare(account1.getBalance(), account2.getBalance()));
	    
		if(maximumBalanceAccount.isPresent()) {
	    	System.out.println("Account with the maximum balance is: " + maximumBalanceAccount.get());
		} 
				
		
		List<String> namesGreaterThanSixChar = accounts.stream()
                .map(Account::getName)
                .filter(name -> name.length() > 6)
                .collect(Collectors.toList());
        
        System.out.println("Names with more than 6 characters: " + namesGreaterThanSixChar);
        
        
//		int sum = accounts.stream().reduce(0, (account1.getBalance(), account2.getBalance() -> account1.getBalance()-getBalance());
//		System.out.println("Sum is: " + sum);
		
	}
}
