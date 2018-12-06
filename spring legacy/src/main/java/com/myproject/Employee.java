package com.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Employee implements ParentInterface,ApplicationEventPublisherAware  {

	private String name;
	private int id;
	private String orgname;
	
	//two param constructor - need to pass two constructor args while config beans
	
	/*if we are having two -one param constructors but both are initialising two diff types - while passing params through xml
	 * it will leads to ambigiuity as spring has automatic casting ( in xml we will pass int value also as string but spring will
	 *  take care of converting string to int. so to avoid this we need to pass type attribute in consturctor args
	 */
	
	/*To pass parameters to constructor in order need to use index attribute 
	*/
	public Employee( int id ,String orgname)
	{
		this.id = id;
		this.orgname= orgname;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public String getOrgname() {
		return orgname;
	}
	
	
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void displayInfo(){  
	    System.out.println("Hello Employee your name is "+getName() +" and id is "+ getId() +" your org name is "+ getOrgname() );  
	    System.out.println("message source form employee file"+this.messageSource.getMessage("greeting", null, "hi bro", null));
	    ListenEvent event =new ListenEvent(this);
	    publisher.publishEvent(event);
	}
	

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
		
	}  
	
}
