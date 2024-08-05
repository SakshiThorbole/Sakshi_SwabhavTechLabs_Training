package com.aurionpro.structural.facade.model;

public class SoundSystem implements InterfaceON {
	public String Volume;
	
	public String getVolume() {
		return Volume;
	}

	public void setVolume(String volume) {
		Volume = volume;
	}

	@Override
	public void on() {
		System.out.println("Sound On");
		
	}

}
