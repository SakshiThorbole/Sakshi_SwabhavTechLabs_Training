package com.aurionpro.creational.builder.model;

public class HouseBuilder {
	public String foundation;
	public String structure;
	
	public boolean hasGarden = false;
	public boolean hasSwimmingPool = false;
	
	public HouseBuilder(String foundation, String structure) {
		super();
		this.foundation = foundation;
		this.structure = structure;
	}

	
	public HouseBuilder setGarden(boolean hasGarden) {
		this.hasGarden = hasGarden;
		return this;
	}

	public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
		return this;
	}
	
	// Build method to create the final House object
	public House build() {
		return new House(this);
	}
}
