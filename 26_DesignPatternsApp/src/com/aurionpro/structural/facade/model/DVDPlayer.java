package com.aurionpro.structural.facade.model;

public class DVDPlayer implements InterfaceON {
	public String Movie;
	
	
	public String getMovie() {
		return Movie;
	}

	public void setMovie(String movie) {
		Movie = movie;
	}


	@Override
	public void on() {
		System.out.println("DVD On");
	}
	
}
