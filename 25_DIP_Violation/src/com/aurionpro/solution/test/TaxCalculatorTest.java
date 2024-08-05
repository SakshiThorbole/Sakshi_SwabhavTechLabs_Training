package com.aurionpro.solution.test;

import com.aurionpro.solution.model.DBLogger;
import com.aurionpro.solution.model.FileLogger;
import com.aurionpro.solution.model.TaxCalculator;

public class TaxCalculatorTest {

    public static void main(String[] args) {
        TaxCalculator t1 = new TaxCalculator(new DBLogger());
        System.out.println("Tax is: " + t1.calculateTax(100, 10));

        t1.setLogger(new FileLogger());
        System.out.println("Tax is: " + t1.calculateTax(100, 10));
    }
}
