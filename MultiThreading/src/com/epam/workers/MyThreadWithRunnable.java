package com.epam.workers;

public class MyThreadWithRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+"i="+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
