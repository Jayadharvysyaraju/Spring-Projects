package com.myproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Mainfile {

	public static void main(String[] args) {  
		
		//deprecated approach
	    Resource resource=new ClassPathResource("ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	    
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();
	    
	    // new approach
	    ApplicationContext context =   
	    	    new ClassPathXmlApplicationContext("ApplicationContext.xml");
	    
	    Employee employee=(Employee)context.getBean("employeebean");  
	    employee.displayInfo();
  
	    // to understand bean life cycle hooks -changed application context to abstractapp conxt, particularly to unsderstand destroy()
	    AbstractApplicationContext context1 =  
	    	    new ClassPathXmlApplicationContext("ApplicationContext.xml");
	    //once the main method execution is completed , below line will clear all beans.
	    context1.registerShutdownHook();
	 // we can get beans by using name ,id , alias but it's good practice to use id
	    NonEmployee nonEmployee=(NonEmployee)context1.getBean("nonemployeebean");  
	    nonEmployee.displayInfo();
	      
	    
	    //By using interface 
	    ParentInterface PI = (ParentInterface)context1.getBean("employeebean");
	    PI.displayInfo();
	    
	    //to retrieve values from property file using message source
	    System.out.println("message source form main file"+context1.getMessage("greeting", null, "hi bro", null));
	  
	}  
}
