package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String n = scanner.next();
		bankAccount.setName(n);
		
		
		System.out.println("Enter your Balance: ");
		double b = scanner.nextDouble();
		bankAccount.setBalance(b);
		
		System.out.println("Name is: " + bankAccount.getName());
		System.out.println("Balance is: " + bankAccount.getBalance());
		System.out.println("Account Number is: " + bankAccount.getAccountNumber());
		
		System.out.println("Enter amount to be credit: ");
		double creditAmount = scanner.nextDouble();
		bankAccount.credit(creditAmount);
		
		
		System.out.println("Enter amount to be debit: ");
		double debitAmount = scanner.nextDouble();
		bankAccount.debit(debitAmount);	

	}

}
