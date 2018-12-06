package com.epam.client;

public class ClientTestWithLamdaExp {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> {
				
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName()+",i="+i);
					}
				}
		);

		Thread t2 = new Thread(()-> {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName()+",i="+i);
				}
			}
		);
		
		Runnable r=()->{
			for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+",i="+i);
			}	
		};
		
		Thread t3 = new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
