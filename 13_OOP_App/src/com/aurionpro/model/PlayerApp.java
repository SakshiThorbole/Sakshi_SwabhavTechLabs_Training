package com.aurionpro.model;

public class PlayerApp {
	private int playerID;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	public PlayerApp(int playerID, String name, int numberOfMatches, int runs, int numberOfWickets) {
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
	
	public void display() {
		System.out.println("Player ID is: "+ this.getPlayerID());
		System.out.println("Name: "+ this.getName());
		System.out.println("Number of Matches: "+ this.getNumberOfMatches());
		System.out.println("Runs: " + this.getRuns());
		System.out.println("Number of wickets: " + this.getNumberOfWickets());
		System.out.println("Average " + this.calculateAverage());
	}
}
