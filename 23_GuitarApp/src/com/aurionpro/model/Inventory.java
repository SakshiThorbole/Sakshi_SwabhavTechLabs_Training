package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            Builder builder = searchGuitar.getBuilder();
            if (builder != null && !builder.equals(guitar.getBuilder())) 
            	continue;

            String model = searchGuitar.getModel().toLowerCase();
            if (model != null && !model.equals("") && !model.equals(guitar.getModel().toLowerCase())) 
            	continue;

            Type type = searchGuitar.getType();
            if (type != null && !type.equals(guitar.getType())) 
            	continue;

            Wood backWood = searchGuitar.getBackWood();
            if (backWood != null && !backWood.equals(guitar.getBackWood())) 
            	continue;

            Wood topWood = searchGuitar.getTopWood();
            if (topWood != null && !topWood.equals(guitar.getTopWood())) 
            	continue;

            return guitar;
        }
        return null;
    }
}
