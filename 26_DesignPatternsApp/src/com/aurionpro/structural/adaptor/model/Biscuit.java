package com.aurionpro.structural.adaptor.model;

public class Biscuit implements IItems {
	private String name;
	private int price;
	
	public Biscuit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String getItemName() {
		return this.name;
		
	}

	@Override
	public double getItemPrice() {
		return this.price;
		
	}

}
