package com.aurionpro.behavioural.iterator.test;

import com.aurionpro.behavioural.iterator.model.IAggregate;
import com.aurionpro.behavioural.iterator.model.IIterator;
import com.aurionpro.behavioural.iterator.model.NameRepository;

public class NameTest {
    public static void main(String[] args) {
    	
        NameRepository nameRepository = new NameRepository(); // Create a collection of names
        IIterator iterator = nameRepository.createIterator(); // Get the iterator from the collection

        while (iterator.hasNext()) { // Use the iterator to go through the collection
            String name = (String) iterator.next(); // Get the next name
            System.out.println("Name: " + name); // Print the name
        }
    }
}
