package com.aurionpro.creational.abstracts.model;


public class SavingsFactory {
	IAccount account = null;
	
	public IAccount makeAccount(AccountType type) {
		return account = new SavingsAccount();
		
	}
		

}
