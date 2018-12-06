package com.epam.workers;

public class MakingCounter implements Runnable {

	private int counter;
	
	public int getCounter() {
		return counter;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 2000; i++) {
			increment();
		}
	}

	private synchronized void increment() {
		counter++;
	}
}
