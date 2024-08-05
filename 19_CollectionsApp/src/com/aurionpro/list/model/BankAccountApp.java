package com.aurionpro.list.model;

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
		super();
		this.accountNumber = generateAccountNumber();
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccountApp [accountNumber = " + accountNumber + ", name = " + name + ", balance = " + balance
				+ ", accountType = " + accountType + "]";
	}
}
