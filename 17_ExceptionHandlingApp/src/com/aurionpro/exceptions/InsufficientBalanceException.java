package com.aurionpro.exceptions;

public class InsufficientBalanceException extends RuntimeException {
	
	private double balance;

	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}
	
	public String getMessage() {
		return "You have insufficient balance: " + balance;
	}
}
