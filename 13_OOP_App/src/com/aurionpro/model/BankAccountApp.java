package com.aurionpro.model;

import java.util.Random;

public class BankAccountApp {
	private long accountNumber;
	private String name;
	private double balance;
	private String accountType;
	
	public BankAccountApp() {
		this.accountNumber = generateAccountNumber();
	}
	
	private long generateAccountNumber() {
		Random random = new Random();
        return 1000000000L + (long)(random.nextDouble() * 9000000000L);
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public BankAccountApp(String name, double balance, String accountType) {
		this.accountNumber = generateAccountNumber();
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountType() {
		return this.accountType;
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
	public void display() {
		System.out.println("Account Number is: "+ this.getAccountNumber());
		System.out.println("Name: "+ this.getName());
		System.out.println("balance: "+ this.getBalance());
		System.out.println("Account Type: " + this.getAccountType());
	}
}
