package com.aurionpro.model;

import com.aurionpro.exceptions.AgeNotValidException;

public class Voter {
	
	private int voterID;
	private String firstName;
	private String lastName;
	private int age;
	public Voter(int voterID, String firstName, String lastName, int age) {
		super();
		this.voterID = voterID;
		this.firstName = firstName;
		this.lastName = lastName;
		
			if(age < 18) {
				throw new AgeNotValidException(age);			
			}
			else {	
				this.age = age;
			}
	}
			
	public int getVoterID() {
		return voterID;
	}
	public void setVoterID(int voterID) {
		this.voterID = voterID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18) {
			throw new AgeNotValidException(age);			
		}
		else {	
			this.age = age;
		}
	}
	@Override
	public String toString() {
		return "Voter [voterID=" + voterID + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
}
