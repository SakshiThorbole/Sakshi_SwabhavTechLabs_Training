package com.aurionpro.behavioural.iterator.model;

public class NameIterator implements IIterator {
    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < names.length; // Returns true if there are more items
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++]; // Returns the next item and moves to the next index
        }
        return null;
    }
}
