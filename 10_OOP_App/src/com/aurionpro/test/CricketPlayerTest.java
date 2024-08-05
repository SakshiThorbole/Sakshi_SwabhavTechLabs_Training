package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;
import com.aurionpro.model.Rectangle;

public class CricketPlayerTest {

	public static void main(String[] args) {
//		CricketPlayer cricketPlayer1 = new CricketPlayer(int playerID, String name, int numberOfMatches, int runs, int numberOfWickets);    
		
		Scanner scanner = new Scanner(System.in);
		
		CricketPlayer players[] =  new CricketPlayer[11];
		
		for(int i = 0; i < 1; i++) {
			System.out.println("Enter your playerID: ");
			int playerID = scanner.nextInt();
			
			System.out.println("Enter name: ");
			String name = scanner.next();
			
			System.out.println("Enter numberOfMatches: ");
			int numberOfMatches = scanner.nextInt();
			
			System.out.println("Enter runs: ");
			int runs = scanner.nextInt();
			
			System.out.println("Enter numberOfWickets: ");
			int numberOfWickets = scanner.nextInt();
			
			players[i] = new CricketPlayer(playerID, name, numberOfMatches, runs, numberOfWickets);
		}
		for(int i = 0; i < 1; i++) {
			//System.out.println(players[i]);
			System.out.println("PlayerID: " + players[i].getPlayerID());
			System.out.println("Name: " + players[i].getName());
			System.out.println("Number of Matches:" + players[i].getNumberOfMatches());
			System.out.println("Runs:" + players[i].getRuns());
			System.out.println("Number of Wickets:" + players[i].getNumberOfWickets());
			System.out.println("Average " + players[i].calculateAverage());
			
		}
		
//		cricketPlayer1.calculateAverage();	

	}

}
