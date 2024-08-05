package com.aurionpro.maptest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTestDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Sakshi");
		map1.put(4, "Thorbole");
		map1.put(3, "Sonu");
		
		System.out.println(map1);
		
		
	    LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(1, "Sakshi");
		map2.put(4, "Thorbole");
		map2.put(3, "Sonu");
		
		System.out.println(map2);
		
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
		
		map3.put(1, "Sakshi");
		map3.put(4, "Thorbole");
		map3.put(3, "Sonu");
		
		System.out.println(map3);

	}

}
