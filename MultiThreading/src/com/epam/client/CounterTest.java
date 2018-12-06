package com.epam.client;

import com.epam.workers.MakingCounter;

public class CounterTest {

	public static void main(String[] args) {
		
		MakingCounter r = new MakingCounter();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("counter final variable :"+ r.getCounter());

	}

}
