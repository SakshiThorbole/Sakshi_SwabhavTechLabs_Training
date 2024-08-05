package com.aurionpro.test;

import com.aurionpro.model.ITest;
import com.aurionpro.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		
		ITest test = Reference::new;     // Constructor Reference (new --> constructor calling)
		method(test);
		
		ITest test1 = Reference::staticPrint;   // Method
		method(test1);
		
		Reference reference = new Reference();   // Creating object for Non static method 
		
		ITest test2 = reference::print;         // Non static method
		method(test2);

	}

private static void method(ITest test1) 
{
	test1.display();                              
		
}

}
