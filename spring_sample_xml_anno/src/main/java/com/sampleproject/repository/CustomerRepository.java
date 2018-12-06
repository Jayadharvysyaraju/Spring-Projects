package com.sampleproject.repository;

import java.util.List;

import com.sampleproject.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}