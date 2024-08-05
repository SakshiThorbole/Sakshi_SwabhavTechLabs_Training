package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PlayerApp;

public class PlayerAppTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		PlayerApp players[] = new PlayerApp[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter player ID: ");
			int playerID = scanner.nextInt();
			
			System.out.println("Enter name: ");
			String name = scanner.next();
			
			System.out.println("Enter number of matches played: ");
			int numberOfMatches = scanner.nextInt();
			
			System.out.println("Enter runs: ");
			int runs = scanner.nextInt();
			
			System.out.println("Enter number of wickets: ");
			int numberOfWickets = scanner.nextInt();
			
			players[i] = new PlayerApp(playerID, name, numberOfMatches, runs, numberOfWickets);
			
		}
		
		getMaximumAveragePlayer(players);		
	}
	
	public static void getMaximumAveragePlayer(PlayerApp[] players) { 
		int n = players.length;
		
		for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1; j++) {
	            if (players[j].calculateAverage() > players[j + 1].calculateAverage()) {
	                PlayerApp temp = players[j];
	                players[j] = players[j + 1];
	                players[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Players in ascending order of average runs:");
        for (int i = 0; i < players.length; i++) {
            players[i].display();
        }
	}
}
