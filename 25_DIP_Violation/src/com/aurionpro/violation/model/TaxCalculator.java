package com.aurionpro.violation.model;

public class TaxCalculator {
	
	DBLogger dblogger = new DBLogger();

	public TaxCalculator() {
		super();
		this.dblogger = dblogger;
	}
	
	public int calculateTax(int amount, int rate) {
		return amount/rate;
	}
	

}
