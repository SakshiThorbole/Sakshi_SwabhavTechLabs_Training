package com.aurionpro.creational.factory.model;

public class AccountFactory {
	public static IAccount makeAccount(Type type) {
		IAccount account = null;
		
		if(type == Type.SAVINGS)
			account = new SavingsAccount();
		if(type == Type.CURRENT)
			account = new CurrentAccount();
		
		
		return account;
		
	}

}
