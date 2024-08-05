package com.aurionpro.behavioural.strategy.test;

import com.aurionpro.behavioural.strategy.model.AddOperation;
import com.aurionpro.behavioural.strategy.model.MultiplyOperation;
import com.aurionpro.behavioural.strategy.model.OperationStrategy;

public class OperationTest {

	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		op.doOperation(10, 20);
		
		op.setOperation(new MultiplyOperation());
		op.doOperation(20, 2);

	}

}
