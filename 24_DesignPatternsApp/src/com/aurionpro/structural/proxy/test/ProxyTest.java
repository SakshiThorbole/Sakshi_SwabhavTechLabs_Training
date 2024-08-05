package com.aurionpro.structural.proxy.test;

import com.aurionpro.structural.proxy.model.IImage;
import com.aurionpro.structural.proxy.model.ProxyImage;

public class ProxyTest {

	public static void main(String[] args) {
		IImage image = new ProxyImage("test.jpg");
		
		image.display();
		System.out.println("");

        
        image.display();                 /* Image will not be loaded from disk &
                       					only displays the image without loading it again, 
                       				   demonstrating the lazy loading */

	}

}
