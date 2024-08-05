package com.aurionpro.model;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("Process Payment of Credit Card...");
		
	}
	

}
