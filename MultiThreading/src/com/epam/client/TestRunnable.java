package com.epam.client;

import com.epam.workers.MyThreadWithRunnable;

public class TestRunnable {

	public static void main(String[] args) {
		
		MyThreadWithRunnable r =new MyThreadWithRunnable();
		Thread t1 = new Thread(r,"T1");
		Thread t2 = new Thread(r);
		t2.setName("T2");
		
		Thread t3 = new Thread(r,"T3");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t3);
		t1.start();
		t2.start();
		t3.start(); 
		
	}
}
