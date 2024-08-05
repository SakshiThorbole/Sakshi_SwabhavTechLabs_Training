package com.aurionpro.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		
//		ArrayList list = new ArrayList();
		
		List<String> list = new ArrayList();
		
//		List<Integer> integers = Arrays.asList(10, 20, 30, 40);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.add("Sakshi");
		list.add("Thorbole");
		list.add("Adi");
		
		System.out.println(list);
		
		System.out.println("Using Normal For Loop:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using Advanced For Loop:");
		for(String name: list) {
			System.out.println(name);
		}
		
		System.out.println("Using Iterator:");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using List Iterator:");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
		
		
		
//		list.add(1, "Adi");
//		System.out.println(list);
//		
//      list.add(50);
//		System.out.println(list);
//		
//		list.remove("Thorbole");
//		System.out.println(list);
//		
//		list.set(2, "Raj");
//		System.out.println(list);
//		
//		int find = list.indexOf("Adi");
//		System.out.println(find);
//	}
//}
