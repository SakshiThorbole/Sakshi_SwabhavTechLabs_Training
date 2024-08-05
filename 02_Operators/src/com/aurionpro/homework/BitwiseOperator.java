package com.aurionpro.homework;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		
		  
        a &= 5;  
        System.out.println("Bitwise AND Operator  a &= 5: " + a);  
          
          
        a |= 2;  
        System.out.println("Bitwise OR Operator  a |= 2: " + a);  
          
          
        a ^= 1;  
        System.out.println("Bitwise XOR Operator  a ^= 1: " + a);  
		
	}

}
