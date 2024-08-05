package com.aurionpro.creational.factory.model;

public class SavingsAccount implements IAccount {
	private double balance = 10000;
	

	@Override
	public void credit(double amount) {
		if (amount <= 0) {
            System.out.println("Credit amount must be positive.");
        } 
		else {
            balance = balance + amount;
            System.out.println("Amount credited successfully. New balance is: " + balance);
        }	
		
	}

	@Override
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
