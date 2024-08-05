package com.aurionpro.test;

import com.aurionpro.model.BankAccountCount;

public class BankAccountCountTest {
    public static void main(String[] args) {
        BankAccountCount account1 = new BankAccountCount();
        BankAccountCount account2 = new BankAccountCount();
        BankAccountCount account3 = new BankAccountCount();

        System.out.println("Total accounts created: " + BankAccountCount.getAccountCount());
    }
}
