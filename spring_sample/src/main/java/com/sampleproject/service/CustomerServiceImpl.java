package com.sampleproject.service;

import java.util.List;

import com.sampleproject.model.Customer;
import com.sampleproject.repository.CustomerRepository;
import com.sampleproject.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.sampleproject.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
