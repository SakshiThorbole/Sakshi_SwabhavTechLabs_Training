package com.aurionpro.behavioural.strategy.model;

public class MultiplyOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		int result = a * b;
		System.out.println("Result of multiplication : " +  result);
		return result;
	}

}
