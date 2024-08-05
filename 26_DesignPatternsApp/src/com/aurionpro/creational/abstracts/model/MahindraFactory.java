package com.aurionpro.creational.abstracts.model;



public class MahindraFactory implements ICarFactory {
	ICar car = null;

	@Override
	public ICar makeCar(String carName) {
		
		return car = new Mahindra();
		
	}

}
