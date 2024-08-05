package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class IFactorialTest {

	public static void main(String[] args) {
		
		IFactorial factorialNumber = (int number) -> {
			
			int fact = 1;
			for (int i = 1;i <= number;i++) {
				fact = fact*i;
			}
			return fact;
		};
		System.out.println(factorialNumber.factorial(4));
	}

}
