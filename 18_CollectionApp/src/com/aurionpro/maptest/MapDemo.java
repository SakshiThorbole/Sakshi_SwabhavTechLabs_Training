package com.aurionpro.maptest;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Sakshi");
		map.put(4, "Thorbole");
		map.put(3, "Sonu");
		
		System.out.println(map);
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
