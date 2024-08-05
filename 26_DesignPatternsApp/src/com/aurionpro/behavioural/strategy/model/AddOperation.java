package com.aurionpro.behavioural.strategy.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		int sum = a + b;
		System.out.println("Result of addition: " + sum);
		return a + b;
		
	}

}
