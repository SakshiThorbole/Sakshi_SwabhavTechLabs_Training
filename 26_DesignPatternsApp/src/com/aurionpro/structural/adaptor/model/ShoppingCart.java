package com.aurionpro.structural.adaptor.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private List<IItems> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public List<IItems> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<IItems> cartItems) {
        this.cartItems = cartItems;
    }
    
    public void addItemToCart(IItems item) {
        this.cartItems.add(item);
    }
    
    
    public double getCartPrice() {
        double total = 0;
        for (IItems item : cartItems) {
            total = total +  item.getItemPrice();
        }
        return total;
    }
    
    
	
	public void display() {
		for(IItems item: cartItems) {
			System.out.println("Cart Items are: " + item.getItemName());
			System.out.println("Cart Price is: " + item.getItemPrice());
			
					
		}		
		
	}
       
}
