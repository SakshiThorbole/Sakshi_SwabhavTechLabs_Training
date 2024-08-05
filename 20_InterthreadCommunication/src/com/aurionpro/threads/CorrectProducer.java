package com.aurionpro.threads;

public class CorrectProducer implements Runnable {
	CorrectQ q;
	
	public CorrectProducer(CorrectQ q) {
		this.q = q;
		new Thread(this, "Producer").start();
	 }
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		 }
		
	}

}
