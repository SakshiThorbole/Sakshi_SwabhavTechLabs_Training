package com.aurionpro.iterative.test;

public class SumOfNumbers {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
