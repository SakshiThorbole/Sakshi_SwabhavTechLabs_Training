package com.aurionpro.creational.abstracts.model;



public interface IAccountFactory {
	IAccount makeAccount(AccountType type);
}
