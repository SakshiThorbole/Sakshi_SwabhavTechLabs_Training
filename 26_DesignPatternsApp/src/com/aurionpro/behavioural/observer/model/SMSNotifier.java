package com.aurionpro.behavioural.observer.model;

public class SMSNotifier implements INotifier {

    @Override
    public void notify(Account account) {
    	System.out.println("SMS Sent to account: " + account.getAccountNumber());
    }
}
