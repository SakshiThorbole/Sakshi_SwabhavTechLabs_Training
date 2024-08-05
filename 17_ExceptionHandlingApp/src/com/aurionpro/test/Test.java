package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double result = number1 / number2;		
			System.out.println("Result is: " + result);			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Invalid input for number2. Number2 two cannot be zero!!");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Division requires two arguments. Please enter two values!!");
		}
		
		catch(NumberFormatException e) {
			System.out.println("Division cannot be performed other than numbers. Please enter only valid number values!!");
		}
		
		catch(Exception e) {
			System.out.println("Exception Occured!!");
		}
		
		finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("Exiting...");
	}
}
