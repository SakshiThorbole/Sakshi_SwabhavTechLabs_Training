package com.aurionpro.test;

import com.aurionpro.threads.CorrectConsumer;
import com.aurionpro.threads.CorrectProducer;
import com.aurionpro.threads.CorrectQ;

public class CorrectConsumerProducer {
	public static void main(String[] args) {
		
		CorrectQ q = new CorrectQ();
		new CorrectProducer(q);
		new CorrectConsumer(q);
		System.out.println("Press Control-C to stop.");

	}

}
