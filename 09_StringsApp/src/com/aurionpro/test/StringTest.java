package com.aurionpro.test;

public class StringTest {

	public static void main(String[] args) {
		
//		String name1 = "Sakshi";
//		String name2 = "Sakshi";
//		
//		
//		String name3 = new String("Sakshi");
//		
//		System.out.println(name1.hashCode());
////		System.out.println(name2.hashCode());
//		System.out.println(name3.hashCode());
//		
//		
//		System.out.println(name1 == name3);        //same content hai iss liye same value aaya else different..
//
//		System.out.println(name1.hashCode());
//		name1 = name1 + "Thorbole";
//		System.out.println(name1);
//		System.out.println(name1.hashCode());
		
//		StringBuffer  name5 = new StringBuffer("Sakshi");
//		System.out.println(name5.hashCode());
//		name5 = name5.append("Thorbole");
//		System.out.println(name5.hashCode());
		
		
		StringBuilder name6 = new StringBuilder("Sakshi1");
		System.out.println(name6.hashCode());
		name6 = name6.append("Thorbole");
		System.out.println(name6.hashCode());
		
	}

}
