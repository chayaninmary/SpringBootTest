package com.example.demo.Services;
/*
Name: Chayanin Petchdasda
Date: April 24, 2020  
Purpose of this class is create an implementation for CustomerSerice interface 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.Data.Customer;
import com.example.demo.Repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements customerSericeInterface {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();//return all customers details from database
	}

	@Override
	public Customer getCustomerId(int custId) { //this method used to read customer data by customer id

		Optional<Customer> optionalCust =  Optional.ofNullable(customerRepository.findById(custId));
		//Optional object use for check if a customer id is existing or not
		if(optionalCust.isPresent()) {
			return optionalCust.get(); //if customer id is exist then return a value
		}
		return null;
	}

	@Override
	public Customer createCustomer(Customer cust) {
		
		return customerRepository.save(cust);
	}

	@Override
	public Customer updateCustomer(Customer cust) {

		return customerRepository.save(cust); //repository class return save method to update existing ones into database 
	}
	
	@Override
	public void deleteCustomer(Customer custId) {

		customerRepository.delete(custId);//delete a record by id

	}
}