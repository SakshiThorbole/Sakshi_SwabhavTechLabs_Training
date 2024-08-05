package com.aurionpro.behavioural.observer.model;

public class EmailNotifier implements INotifier {

    @Override
    public void notify(Account account) {
    	System.out.println("Email Sent to account: " + account.getAccountNumber());
    }
}
