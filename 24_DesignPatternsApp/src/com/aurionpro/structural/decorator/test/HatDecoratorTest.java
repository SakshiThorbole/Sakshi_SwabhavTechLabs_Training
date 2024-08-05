package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibonedHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		
		IHat standardHat = new StandardHat();
        System.out.println("Name: " + standardHat.getName());
        System.out.println("Price: $" + standardHat.getPrice());
        System.out.println("Description: " + standardHat.getDescription());

        IHat goldenHat = new GoldenHat(standardHat);
        System.out.println("\nName: " + goldenHat.getName());
        System.out.println("Price: $" + goldenHat.getPrice());
        System.out.println("Description: " + goldenHat.getDescription());

        IHat ribonedHat = new RibonedHat(goldenHat);
        System.out.println("\nName: " + ribonedHat.getName());
        System.out.println("Price: $" + ribonedHat.getPrice());
        System.out.println("Description: " + ribonedHat.getDescription());
        
        IHat premiumHat = new PremiumHat();
        System.out.println("Name: " + premiumHat.getName());
        System.out.println("Price: $" + premiumHat.getPrice());
        System.out.println("Description: " + premiumHat.getDescription());
        
        
//        IHat goldenHat1 = new GoldenHat(premiumHat);
//        System.out.println("\nName: " + goldenHat1.getName());
//        System.out.println("Price: $" + goldenHat1.getPrice());
//        System.out.println("Description: " + goldenHat1.getDescription());
		

	}

}
