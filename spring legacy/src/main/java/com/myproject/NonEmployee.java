package com.myproject;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class NonEmployee implements ParentInterface,InitializingBean,DisposableBean{
	
	private Address A1;
	
	//inner bean example - if we dont want to use the same object(values in xml ) for other, ex: if we want this address for only nonemployee. 
	private Address A2;
	
	// alias name , id ref
	private Address A3;
	
	// autowire by name
	private Address A4;

	// collections implementation
	private  List<Address> addresses;
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public Address getA1() {
		return A1;
	}
	public void setA1(Address a1) {
		A1 = a1;
	}
	public Address getA2() {
		return A2;
	}
	public void setA2(Address a2) {
		A2 = a2;
	}
	public Address getA3() {
		return A3;
	}
	public void setA3(Address a3) {
		A3 = a3;
	}
	
	public Address getA4() {
		return A4;
	}
	
	@Autowired
	@Qualifier("NonEmpRelated")
	@Required
	public void setA4(Address a4) {
		A4 = a4;
	}
	
	public void displayInfo(){  
	    System.out.println("Hello Non Employee A1 your Address is "+ A1.getCity()+" "+A1.getState());
	    System.out.println("Hello Non Employee A2 your Address is "+ A2.getCity()+" "+A2.getState());  
	    System.out.println("Hello Non Employee A3 your Address is "+ A3.getCity()+" "+A3.getState());
	    System.out.println("Hello Non Employee A4 your Address is "+ A4.getCity()+" "+A4.getState());  
	    
	    for( Address address: addresses)
	    {
	    	System.out.println("Hello Non Employee your Address is "+ address.getCity()+" "+address.getState());
	    }
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initialzing bean");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroying bean");
		
	}
	
	public void myInit()
	{
		System.out.println("initialzing my init");
	}
	
	public void myDestroy()
	{
		System.out.println("initialzing my init");
	}
	
	@PostConstruct
	public void Init()
	{
		System.out.println("initialzing my init with annotation");
	}
	
	@PreDestroy
	public void Destroy()
	{
		System.out.println("initialzing my init with annotation");
	}

}
