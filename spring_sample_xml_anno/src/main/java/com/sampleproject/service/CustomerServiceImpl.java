package com.sampleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleproject.model.Customer;
import com.sampleproject.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired //-member variable autowired
	private CustomerRepository customerRepository;

	@Autowired // Constructor injection autowiring
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}

	//@Autowired //-setter injection autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("we are using setter injection");
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
