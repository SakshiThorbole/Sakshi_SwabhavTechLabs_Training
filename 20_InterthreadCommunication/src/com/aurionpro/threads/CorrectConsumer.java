package com.aurionpro.threads;

public class CorrectConsumer implements Runnable {
	CorrectQ q;
	
	public CorrectConsumer(CorrectQ q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	 }
	
	@Override
	public void run() {
		while(true) {
			q.get();
			}
		
	}

}
