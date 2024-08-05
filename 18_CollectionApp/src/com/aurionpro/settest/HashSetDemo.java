package com.aurionpro.settest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Sakshi");
		set1.add("Thorbole");
		set1.add("Adi");
		set1.add("Adi");
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Sakshi");
		set2.add("Thorbole");
		set2.add("Adi");
		set2.add("Adi");
		
		System.out.println(set2);
		
		
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Sakshi");
		set3.add("Thorbole");
		set3.add("Adi");
		set3.add("Adi");
		
		System.out.println(set3);

	}

}
