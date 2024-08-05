package com.aurionpro.model;

public class CricketPlayer {
	private int playerID;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
//	public CricketPlayer() {
//		playerID = 1;
//		name = "null";
//		numberOfMatches = 0;
//		runs = 0;
//		numberOfWickets = 0;
//	}
	
	
	public CricketPlayer(int playerID, String name, int numberOfMatches, int runs, int numberOfWickets) {
		this.playerID = playerID;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
	}
	
	public void setplayerID(int playerID) {
		this.playerID = playerID;
	}
	
	public int getPlayerID() {
		return this.playerID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNumberOfMatches(int numberOFMatches) {
		this.numberOfMatches = numberOFMatches;
	}
	
	public int getNumberOfMatches() {
		return this.numberOfMatches;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getRuns() {
		return this.runs;
	}
	
	public void setNumberOfWickets(int numberOfWicktes) {
		this.numberOfWickets = numberOfWicktes;
	}
	
	public int getNumberOfWickets() {
		return this.numberOfWickets;
	}
	
	public int calculateAverage() {
		return runs / numberOfWickets;	
	}
}


