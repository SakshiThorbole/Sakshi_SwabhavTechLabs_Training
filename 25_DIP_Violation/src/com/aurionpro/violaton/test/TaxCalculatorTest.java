package com.aurionpro.violaton.test;

import com.aurionpro.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String args[]) {
		
		TaxCalculator t1 = new TaxCalculator();
		System.out.println("Tax is: " + t1.calculateTax(100, 10));
		
		TaxCalculator t2 = new TaxCalculator();
		System.out.println("Tax is: " + t1.calculateTax(2000, 10));
	}

}
