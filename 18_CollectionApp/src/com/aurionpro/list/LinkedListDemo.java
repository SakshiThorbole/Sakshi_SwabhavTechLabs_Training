package com.aurionpro.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Sakshi");
		list.addFirst("Thorbole");
		list.addLast("Sonu");
		
		for(String name: list) {
			System.out.println(name);
		}
		
		System.out.println("Last element is: " + list.getLast());
//		System.out.println("Peek element is: " + list.peek());
//		list.poll();
		System.out.println("Pop Element is: " + list.poll());
		
		System.out.println(list);
		
	}

}
