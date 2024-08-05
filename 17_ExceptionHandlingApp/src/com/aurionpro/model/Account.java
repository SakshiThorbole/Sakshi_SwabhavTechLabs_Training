package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAmount() {
		return getAmount();
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public void credit(double amount) {
		if( amount <= 0) {
			System.out.println("Credit amount must be positive.");
		}
		else {
            balance = balance + amount;
            System.out.println("Amount credited successfully. New balance is: " + balance);
        }
	}
	
	public void debit(double amount) {
		if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount debited successfully " + amount);
            System.out.println("New balance is: " + balance);
        } 
		else if (amount > balance) {
            throw new InsufficientBalanceException(balance);
        } 
		else {
            System.out.println("Debit amount must be positive.");
        }
	}
}
