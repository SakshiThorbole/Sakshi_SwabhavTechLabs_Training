package com.aurionpro.exceptions;

public class MinimumBalanceException extends RuntimeException {
	private double minBalance;

    public MinimumBalanceException(double minBalance) {
        super();
        this.minBalance = minBalance;
    }

    @Override
    public String getMessage() {
        return "Cannot debit: Minimum balance requirement is $" + minBalance;
    }
}

