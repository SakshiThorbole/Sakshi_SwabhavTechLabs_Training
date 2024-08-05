package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException {
	private String emailID;

	public EmailNotValidException(String emailID) {
		super();
		this.emailID = emailID;
	}
	
	@Override
	public String getMessage() {
		return "Email is not meeting the required criteria: " + emailID;		
	}
}
