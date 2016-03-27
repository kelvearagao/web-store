package com.packt.webstore.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

	private List<Customer> customers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer customer1 = new Customer("c1", "Kelve Aragão", "Costa barros, 182, Centro, Fortaleza-CE", 3);
		Customer customer2 = new Customer("c2", "Ivan Aragão", "Vila Gonçalves, 170, Centro, Fortaleza-CE", 10);
		Customer customer3 = new Customer("c3", "Cleide Aragão", "Dr Marinho, 800, Junco, Sobral-CE", 5);
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
}
