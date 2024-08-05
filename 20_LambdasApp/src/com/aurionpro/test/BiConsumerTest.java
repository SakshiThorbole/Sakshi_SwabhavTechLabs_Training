package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> AdderBiConsumer = (Integer number1, Integer number2) -> System.out.println(number1 + number2);
		
		AdderBiConsumer.accept(2, 2);
	}

}
