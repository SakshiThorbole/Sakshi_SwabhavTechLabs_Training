package com.aurionpro.creational.prototype.model;

public interface IShape {      // every shape should be able to clone itself and draw.
	IShape clone();           // Make a copy of itself
	void draw();             // Draw the shape
}


