package com.aurionpro.creational.factory.model;

public class CarFactory {
	public static ICar makeCar(String carName) {
		ICar car = null;
		
		if(carName == "Cars.MARUTI")
			car = new Maruti();
		if(carName == "Cars")
			car = new Tata();
		if(carName == "Mahindra")
			car = new Mahindra();
		
		return car;
		
	}

}
