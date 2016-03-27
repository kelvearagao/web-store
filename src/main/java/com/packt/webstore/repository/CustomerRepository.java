package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.domain.Customer;

public interface CustomerRepository {
	
	List<Customer> getAllCustomers();

}
