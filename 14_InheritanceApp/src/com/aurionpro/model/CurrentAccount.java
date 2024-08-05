package com.aurionpro.model;

public class CurrentAccount extends Account {
	private double overdraftLimit;

    public CurrentAccount(long accountNumber, String name, double balance, double overdraftLimit) {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
