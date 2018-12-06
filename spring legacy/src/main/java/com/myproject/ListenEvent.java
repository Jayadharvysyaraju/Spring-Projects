package com.myproject;

import org.springframework.context.ApplicationEvent;

public class ListenEvent extends ApplicationEvent{

	public ListenEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "new event triggerd";
		
	}

}
