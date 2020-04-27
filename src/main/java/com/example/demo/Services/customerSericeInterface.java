package com.example.demo.Services;
import java.util.List;

import com.example.demo.Data.Customer;
/*
Name: Chayanin Petchdasda
Date: April 24, 2020  
Purpose of this interface is business logic inside service layer, 
which gives a layer of separation from controller and database related operations.
all methods below are  defined for create, update, get customer by Id, 
delete and get all available customer from database. 
 */
public interface customerSericeInterface {

	List<Customer> getAllCustomer();
	Customer getCustomerId(int custId);
	Customer createCustomer(Customer cust);
	Customer updateCustomer(Customer cust);
	void deleteCustomer(Customer cust);

}
