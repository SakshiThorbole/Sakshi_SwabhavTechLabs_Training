package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator {
	
	public OilChange(ICarService carObj) {
		super(carObj);	
	}
	
	public double getCost() {
		return 500 + carObj.getCost(); 
	}
}
