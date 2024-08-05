package com.aurionpro.solution.test;

import com.aurionpro.solution.model.FixedDeposit;
import com.aurionpro.solution.model.IFestivalInterest;
import com.aurionpro.solution.model.NewYearInterest;

public class FixedDepositTest {

	public static void main(String[] args) {
		 IFestivalInterest newYearInterest = new NewYearInterest();
		 
		 FixedDeposit fixedDeposit1 = new FixedDeposit(100, "Sakshi", 10000, 1, newYearInterest);
		 
		 System.out.println("Simple Interest: " + fixedDeposit1.calculateSimpleInterest());
		

	}

}
