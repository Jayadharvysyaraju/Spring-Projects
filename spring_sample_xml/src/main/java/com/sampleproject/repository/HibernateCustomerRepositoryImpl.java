package com.sampleproject.repository;

import java.util.ArrayList;
import java.util.List;

import com.sampleproject.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private String dbUsername;
	
	public String getDbUsername() {
		return dbUsername;
	}
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	@Override
	public List<Customer> findAll(){
		
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("jay");
		customer.setLastName("raj");
		
		customers.add(customer);
		
		return customers;
		
	}

}
