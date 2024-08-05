package com.aurionpro.test;

import com.aurionpro.threads.Consumer;
import com.aurionpro.threads.Producer;
import com.aurionpro.threads.Q;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");

	}
}
