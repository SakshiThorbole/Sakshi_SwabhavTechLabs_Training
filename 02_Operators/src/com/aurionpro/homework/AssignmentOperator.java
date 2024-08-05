package com.aurionpro.homework;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		 
        int y = a;  
        System.out.println("Simple Assignment  y = " + y);  
          
        
        a += 5;  
        System.out.println("Addition Assignment  a += 5: " + a);  
          
         
        a -= 3;  
        System.out.println("Subtraction Assignment  a -= 3: " + a);  
          
        
        a *= 2;  
        System.out.println("Multiplication Assignment  a *= 2: " + a);  
          
          
        a /= 4;  
        System.out.println("Division Assignment  a /= 4: " + a);  
          
          
        a %= 3;  
        System.out.println("Modulus Assignment a %= 3: " + a);  
        
        a <<= 2;  
        System.out.println("Left Shift  a <<= 2: " + a);  
          
        
        a >>= 1;  
        System.out.println("Right Shift  a >>= 1: " + a); 
		
	}

}
