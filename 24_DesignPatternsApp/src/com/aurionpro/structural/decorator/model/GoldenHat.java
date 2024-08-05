package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator {
	
	public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return decoratedHat.getName() + " with Gold";
    }

    @Override
    public double getPrice() {
        return decoratedHat.getPrice() + 70.0;
    }

    @Override
    public String getDescription() {
        return decoratedHat.getDescription() + " This hat has golden decorations.";
	}

}
