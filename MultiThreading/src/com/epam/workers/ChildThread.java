package com.epam.workers;

public class ChildThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child thread");
		}
	}
}
