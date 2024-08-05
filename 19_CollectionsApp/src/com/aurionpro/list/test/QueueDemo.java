package com.aurionpro.list.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println(queue);
		
		System.out.println(queue.size());
		
		queue.remove(20);
		System.out.println(queue);
		
		int firstElement = queue.peek();
		System.out.println(firstElement);
		
		boolean checkEmpty = queue.isEmpty();
		System.out.println(checkEmpty);
	}

}
