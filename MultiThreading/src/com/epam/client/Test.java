package com.epam.client;

import com.epam.workers.MyThread;

public class Test {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		MyThread t2 = new MyThread();
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
	}

}
