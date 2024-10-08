package com.aurionpro.structural.adaptor.model;

public class HatAdapter implements IItems {
	private Hat hat;
	
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	public Hat getHat() {
		return hat;
	}

	public void setHat(Hat hat) {
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getShortName() + hat.getLongName();
	}

	@Override
	public double getItemPrice() {
	
		return hat.getBasicPrice() + hat.getTax();
	}
	

}
