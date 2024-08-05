package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException {
	private String password;

	public PasswordNotValidException(String password) {
		super();
		this.password = password;
	}
	
	@Override
	public String getMessage() {
		return "Password is not meeting the required criteria: " + password;		
	}
}
