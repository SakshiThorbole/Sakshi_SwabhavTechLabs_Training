package com.aurionpro.structural.adaptor.test;

import com.aurionpro.structural.adaptor.model.Biscuit;
import com.aurionpro.structural.adaptor.model.Chocolate;
import com.aurionpro.structural.adaptor.model.Hat;
import com.aurionpro.structural.adaptor.model.HatAdapter;
import com.aurionpro.structural.adaptor.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		Hat hat = new Hat("Sakshi", "Thorbole" , 100, 10);
		
		ShoppingCart s1 = new ShoppingCart();
		s1.addItemToCart(new Biscuit("Parle", 10));
		s1.addItemToCart(new Chocolate("Melody", 2));
		s1.addItemToCart(new HatAdapter(hat));
		
		s1.getCartItems();
		s1.getCartPrice();
		s1.display();
		s1.getCartPrice();
		
		System.out.println("Total Cart Price is: " + s1.getCartPrice());
	
		
	}

}
