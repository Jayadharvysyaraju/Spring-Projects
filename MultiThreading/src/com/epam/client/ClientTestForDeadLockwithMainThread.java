package com.epam.client;

public class ClientTestForDeadLockwithMainThread {

	public static void main(String[] args) {
	
		Thread currentThread=Thread.currentThread();
		
		System.out.println(currentThread.getName()+"thread start");

		try {
			currentThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currentThread.getName()+"thread end");
	}

}
