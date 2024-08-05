package com.aurionpro.behavioural.iterator.model;

public class NameRepository implements IAggregate {
    private String[] names = {"Sakshi", "Adi", "Sonu", "Mummy"};

    @Override
    public IIterator createIterator() {
        return new NameIterator(names);
    }
}
