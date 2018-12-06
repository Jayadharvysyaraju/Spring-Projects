package com.epam.client;

import com.epam.workers.ChildThread;

public class ClientTest {
	public static void main(String[] args) {
		//Getting reference to the currently executing thread object
		Thread t = Thread.currentThread();
        
        //Getting name of Main thread
        System.out.println("Current thread: " + t.getName());
         
        // changing the name of Main thread
        t.setName("JavaTutorilas");
        System.out.println("After name change: " + t.getName());
         
        //Getting priority of Main thread
        System.out.println("Main thread priority: "+ t.getPriority());
         
        //Setting priority of Main thread
        t.setPriority(Thread.MAX_PRIORITY);
         
        System.out.println("Main thread new priority: "+ t.getPriority());
         
        // Main thread creating a child thread
        ChildThread ct = new ChildThread();
         
        //Getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "+ ct.getPriority());
         
        //Setting priority of Main thread to MIN(1)
        ct.setPriority(Thread.MIN_PRIORITY);
         
        System.out.println("Child thread new priority: "+ ct.getPriority());
         
        //Starting child thread
        ct.start();
	}
}
