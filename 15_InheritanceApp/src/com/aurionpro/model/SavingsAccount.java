package com.aurionpro.model;

public class SavingsAccount extends Account {
    private double minBalance;

    public SavingsAccount(long accountNo, String name, double balance, double minBalance) {
        super(accountNo, name, balance);
        this.minBalance = minBalance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public void debit(double amount) {
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Debited: $" + amount);
        } else {
            System.out.println("Cannot debit: Minimum balance requirement is $" + minBalance);
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: $" + minBalance);
    }
}
