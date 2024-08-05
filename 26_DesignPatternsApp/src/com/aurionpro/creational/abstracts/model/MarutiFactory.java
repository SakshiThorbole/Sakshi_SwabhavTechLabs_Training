package com.aurionpro.creational.abstracts.model;



public class MarutiFactory implements ICarFactory {
	ICar car = null;

	@Override
	public ICar makeCar(String carName) {

			return car = new Maruti();
		
	}

}
