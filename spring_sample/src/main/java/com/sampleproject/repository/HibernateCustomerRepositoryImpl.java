package com.sampleproject.repository;

import java.util.ArrayList;
import java.util.List;

import com.sampleproject.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.sampleproject.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("jay");
		customer.setLastName("raj");
		
		customers.add(customer);
		
		return customers;
		
	}

}
