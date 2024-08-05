package com.aurionpro.creational.abstracts.model;

public class CurrentFactory {
	IAccount account = null;
	
	public IAccount makeAccount(AccountType type) {
		return account = new CurrentAccount();
		
	}

}
