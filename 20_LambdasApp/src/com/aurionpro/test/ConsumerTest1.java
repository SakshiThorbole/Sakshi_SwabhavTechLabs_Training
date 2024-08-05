package com.aurionpro.test;

import java.util.function.Consumer;

public class ConsumerTest1 {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (Integer number) -> System.out.println("Cube of a number: " + number*number*number);
		
		consumer.accept(2);

	}

}
