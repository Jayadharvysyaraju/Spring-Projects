package com.epam.client;

import com.epam.workers.MyThread1ForDeadLock;
import com.epam.workers.MyThread2ForDeadLock;

public class TestDeadLock {

	public static void main(String[] args) {
	
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		MyThread1ForDeadLock r1 = new MyThread1ForDeadLock(lock1,lock2);
		MyThread2ForDeadLock r2 = new MyThread2ForDeadLock(lock1,lock2);
		
		Thread t1 = new Thread(r1,"T1");
		Thread t2 = new Thread(r2,"T2");
		
		t1.start();
		t2.start();
	}

}
