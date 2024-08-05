package com.aurionpro.model;

public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int width, int height, int depth) {
		super(width, height, depth);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight()
				+ ", getDepth()=" + getDepth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}	
	

}
