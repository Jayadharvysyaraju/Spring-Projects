package com.myproject;

public class Student implements ParentInterface{
	private String name; 
	
	private int id;
	
	

	//one param constructor
	public Student( int id)
	{
		this.id = id;
	}
	  
	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	//no need of adding setters for id variable , spring vl take care of setting it while we are initialising using consturctor
	public int getid() {  
	    return id;  
	}  
	
	public void displayInfo(){ 
	    System.out.println("Hello Student your name is "+name +" and id is "+ getid());  
	  
	}


}
  