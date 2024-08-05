package com.aurionpro.behavioural.observer.model;

public class AppNotifier implements INotifier {

    @Override
    public void notify(Account account) {
    	System.out.println("Sending app notification for account: " + account.getAccountNumber());
    }
}
