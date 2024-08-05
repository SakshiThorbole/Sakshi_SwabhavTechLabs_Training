package com.aurionpro.model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accountNo, String name, double balance, double overdraftLimit) {
        super(accountNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Debited: $" + amount);
        } else {
            System.out.println("Debit amount exceeds overdraft limit of $" + overdraftLimit);
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}
