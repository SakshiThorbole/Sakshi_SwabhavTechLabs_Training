package com.aurionpro.test;

import com.aurionpro.model.IAddition;

public class IAddtionTest {

	public static void main(String[] args) {
		
		IAddition adder = (int number1, int number2) -> number1+number2;
		
		System.out.println(adder.addition(10, 20));

	}

}
