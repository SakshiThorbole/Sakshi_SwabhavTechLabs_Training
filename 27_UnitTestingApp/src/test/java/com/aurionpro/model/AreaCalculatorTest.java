package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.AreaCalculator;

public class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}
	
	@Test
	void testCalculateAreaOfCircle() {
		assertEquals(78.5, calculator.calculateAreaOfCircle(5));
	}

	@Test
	void testCalculateAreaOfRectangle() {
		assertEquals(4, calculator.calculateAreaOfRectangle(2, 2));
	}
	
	@Test
	void testCalculateAreaOfTriangle() {
		assertEquals(4, calculator.calculateAreaOfTriangle(2, 4));
	}

}
