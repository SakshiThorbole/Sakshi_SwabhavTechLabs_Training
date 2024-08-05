package com.aurionpro.homework;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		System.out.println("Enter minutes: ");
		Scanner s1 = new Scanner(System.in);
		int totalMinutes = s1.nextInt();
		
		int hours = totalMinutes / 60;
		int minutes = totalMinutes % 60;
		
		System.out.println(totalMinutes + " minutes is " + hours + " hours and " + minutes + " minutes.");
	}
}
