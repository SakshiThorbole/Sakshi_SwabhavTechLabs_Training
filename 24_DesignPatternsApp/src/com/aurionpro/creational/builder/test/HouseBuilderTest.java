package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.House;
import com.aurionpro.creational.builder.model.HouseBuilder;

public class HouseBuilderTest {
	public static void main(String[] args) {
		House house = new HouseBuilder("Concrete", "Brick")
				.setGarden(true)
				.setSwimmingPool(false)
				.build();
		
		System.out.println(house);
	}
}
