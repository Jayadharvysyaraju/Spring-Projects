package com.epam.client;

public class ClientTestAnonymousRunnable {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName()+",i="+i);
					}
				
			}
		};
		
		Thread thread1= new Thread(r,"T1");
		Thread thread2= new Thread(r,"T2");
		Thread thread3= new Thread(r,"T3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
