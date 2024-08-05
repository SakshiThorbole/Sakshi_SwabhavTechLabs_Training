package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.Operations;

class OperationsTest {
	
	Operations operations;
	
	@BeforeEach
	void init() {
		operations = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Executed");
	}

	@Test
	void testAddition() {
		
		assertEquals(10, operations.addition(5, 5), "This function must do additon");
	}

	@Test
	void testSubtraction() {
		
		assertEquals(5, operations.subtraction(10, 5), "This function must do subtraction");
	}

	@Test
	void testMultiplication() {
		
		assertEquals(4, operations.multiplication(2, 2), "This function must do multiplication");
		assertEquals(8, operations.multiplication(4, 2), "This function must do multiplication");
		assertEquals(20, operations.multiplication(10, 2), "This function must do multiplication");
	}
	
	void testDivision() {
		assertEquals(2, operations.division(6, 3), "This function must do division");
		
	}
	
	@Test
	void testIsEven() {
		assertTrue(operations.iEven(6));
	}

}
