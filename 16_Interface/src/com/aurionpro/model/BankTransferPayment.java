package com.aurionpro.model;

public class BankTransferPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("Process Payment of Bank Transfer Payment...");
		
	}

}
