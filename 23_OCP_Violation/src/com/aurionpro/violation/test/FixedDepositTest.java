package com.aurionpro.violation.test;

import com.aurionpro.violation.model.FestivalType;
import com.aurionpro.violation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fixedDeposit1 = new FixedDeposit(100, "Sakshi", 10000, 5, FestivalType.NEWYEAR);
				
		System.out.println("Interest for fixedDeposit1: " + fixedDeposit1.calculateSimpleInterest());
		
	}
}
