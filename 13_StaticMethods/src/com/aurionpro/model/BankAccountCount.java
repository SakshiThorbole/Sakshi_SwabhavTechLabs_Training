package com.aurionpro.model;

public class BankAccountCount {
	private static int accountCount = 0;
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

}

