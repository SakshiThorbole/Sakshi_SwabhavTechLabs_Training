package com.aurionpro.homework;

import java.util.Scanner;

public class TreasureIsland {
	public static void main(String[] args) {
		System.out.println("Where do you want to move: left or right?");
		Scanner scanner1 = new Scanner(System.in);
		String answer1 = scanner1.nextLine();
		
		if(answer1.equals("right")) {
			System.out.println("It was a hole --> Game Over!!");
		}
		else if(answer1.equals("left")) {
			System.out.println("Want to swim or wait?");
			Scanner scanner2 = new Scanner(System.in);
			String answer2 = scanner2.nextLine();
			
			if(answer2.equals("swim")) {
				System.out.println("Attacked by trout --> Game Over!!");
			}
			if(answer2.equals("wait")) {
				System.out.println("Which door you want to go for: Red or Blue or Yellow?");
				Scanner scanner3 = new Scanner(System.in);
				String answer3 = scanner3.nextLine();
				
				if(answer3.equals("red")) {
					System.out.println("Burned by fire --> Game Over!!");	
				}
				else if(answer3.equals("blue")) {
					System.out.println("Eaten by beasts --> Game Over!!");
				}
				else if(answer3.equals("yellow")) {
					System.out.println("You Win!!...");
				}
			}
		}
	}
}

