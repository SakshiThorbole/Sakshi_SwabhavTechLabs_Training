package com.aurionpro.structural.proxy.model;

public class ProxyImage implements IImage {
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {	
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();		
	}	

}
