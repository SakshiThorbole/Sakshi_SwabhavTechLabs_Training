package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.Cars;
import com.aurionpro.creational.factory.model.CurrentAccount;
import com.aurionpro.creational.factory.model.IAccount;
import com.aurionpro.creational.factory.model.SavingsAccount;
import com.aurionpro.creational.factory.model.Type;

public class AccountTest {

	public static void main(String[] args) {
		IAccount account;
		
		account = AccountFactory.makeAccount(Type.SAVINGS);
		account.credit(500);
		
		
		account = AccountFactory.makeAccount(Type.CURRENT);
		account.debit(100);
		
//		SavingsAccount s1 = new SavingsAccount();
//		s1.credit(500);
//		s1.debit(100);
//		
//		CurrentAccount c1 = new CurrentAccount();
//		c1.credit(500);
//		c1.debit(100);

	}

}
