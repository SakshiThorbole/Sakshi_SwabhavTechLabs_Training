package com.aurionpro.test;

import com.aurionpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.display();
		
//		box.initialize(5, 10, 15);
		
		box.display();
		
		Box box2 = new Box();
		
		System.out.println("Box2");
		
		box2.display();
		
//		box2.initialize(20, 25, 30);
		
		box2.display();
		
	}

}
