package com.aurionpro.creational.abstarcts.test;

import com.aurionpro.creational.abstracts.model.ICar;
import com.aurionpro.creational.abstracts.model.ICarFactory;
import com.aurionpro.creational.abstracts.model.MarutiFactory;

public class CarTest {

	public static void main(String[] args) {
		ICarFactory marutiFactory = new MarutiFactory();
		ICar maruti = marutiFactory.makeCar("maruti");
		maruti.start();
		maruti.stop();

	}

}
