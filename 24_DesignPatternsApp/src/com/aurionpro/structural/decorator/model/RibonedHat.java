package com.aurionpro.structural.decorator.model;

public class RibonedHat extends HatDecorator {

    public RibonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return decoratedHat.getName() + " with Ribbon";
    }

    @Override
    public double getPrice() {
        return decoratedHat.getPrice() + 30.0;
    }

    @Override
    public String getDescription() {
        return decoratedHat.getDescription() + " This hat has a ribbon decoration.";
    }
}
