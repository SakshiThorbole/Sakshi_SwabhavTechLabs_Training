package com.aurionpro.test;

import com.aurionpro.threads.RunnableThread;

public class RunnableThreadTest {

	public static void main(String[] args) {
		
		RunnableThread thread1 = new RunnableThread("Thread1");
		
		try {
			thread1.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

}
