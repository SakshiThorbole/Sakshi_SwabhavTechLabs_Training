package com.aurionpro.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> squareFunction = (Integer number) -> number*number;
		
		System.out.println(squareFunction.apply(5));

	}

}
