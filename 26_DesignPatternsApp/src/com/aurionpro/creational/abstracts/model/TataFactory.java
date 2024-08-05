package com.aurionpro.creational.abstracts.model;



public class TataFactory implements ICarFactory {
	ICar car = null;

	@Override
	public ICar makeCar(String carName) {
		return car = new Tata();
	
		
		
	}

}
