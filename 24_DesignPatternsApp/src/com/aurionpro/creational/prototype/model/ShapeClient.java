package com.aurionpro.creational.prototype.model;

public class ShapeClient {
	private IShape shapePrototype;
	 
	
    public ShapeClient(IShape shapePrototype) {   // When you create a client, you give it a prototype (a shape).
        this.shapePrototype = shapePrototype;
    }
 
   
    public IShape createShape() {           // This method creates a new shape using the prototype.
        return shapePrototype.clone();
    }
}
