package com.aurionpro.model;

import java.util.Random;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance;
	
	public BankAccount() {
        accountNumber = generateAccountNumber();
    }

    private long generateAccountNumber() {
        Random random = new Random();
        return 1000000000L + (long)(random.nextDouble() * 9000000000L);
    }

    public long getAccountNumber() {
        return accountNumber;
    }
	
 
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	
	public void setBalance(double b) {
		balance = b;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void credit(double amount) {
		if (amount <= 0) {
            System.out.println("Credit amount must be positive.");
        } 
		else {
            balance = balance + amount;
            System.out.println("Amount credited successfully. New balance is: " + balance);
        }		
	}
	
	
	public void debit(double amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be positive.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance is: " + balance);
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount debited successfully. New balance is: " + balance);
        }
	}
}

