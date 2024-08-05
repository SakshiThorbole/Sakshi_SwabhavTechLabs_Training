package com.aurionpro.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    
    List<INotifier> notifierList = new ArrayList<>();

    public Account(long accountNumber, String name, double balance) {
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

    public void addNotifier(INotifier notifier) {
        notifierList.add(notifier);
    }

//    private void notifyAllNotifiers() {
//        for (INotifier notifier : notifierList) {
//            notifier.notify(this);
//        }
//    }
    
    

    public void credit(double amount) {
        if (amount <= 0) {
            System.out.println("Credit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Amount credited successfully. New balance is: " + balance);
//            notifyAllNotifiers();
        }
    }

    public void debit(double amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully. New balance is: " + balance);
//            notifyAllNotifiers();
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
