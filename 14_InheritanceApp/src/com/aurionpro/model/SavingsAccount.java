package com.aurionpro.model;

public class SavingsAccount extends Account {
	private double minBalance;

    public SavingsAccount(long accountNumber, String name, double balance, double minBalance) {
        super(accountNumber, name, balance);
        this.minBalance = minBalance;
    }
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: " + minBalance);
    }

}
