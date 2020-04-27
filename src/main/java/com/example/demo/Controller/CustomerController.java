package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Data.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Services.CustomerService;

import java.util.List;

@RestController //Simplify the creation of RESTful webservice
@RequestMapping("/api/v1") //Mapping an http request 
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	private CustomerRepository customerRepository;

	@GetMapping(path = "/customer")
	public List<Customer> getAll(){
		//this method is show all customer
		List<Customer> customerList = customerService.getAllCustomer();
		return customerList;
	}

	@GetMapping(path = "/customer/{id}") //getting customer details by customer id pass from url
	public ResponseEntity<Customer> getCustomer(@PathVariable(value = "id") int custId) {
		//ResponseEntity is generic type can be use any type as the response
		//ResponseEntity also represent the HTTP response
		return new ResponseEntity<>(customerService.getCustomerId(custId), HttpStatus.OK);
	}

	@PostMapping(path = "/customer")
	public ResponseEntity<Customer> createCust(@RequestBody Customer cust) {
		//create new customers record
		return new ResponseEntity<>(customerService.createCustomer(cust), HttpStatus.CREATED);
	}

	@PutMapping (path = "/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cust) {
		//update existing customer record
		return new ResponseEntity<>(customerService.updateCustomer(cust), HttpStatus.CREATED);
	}
	
	@DeleteMapping(path = "/customer/{id}")
	public void deleteById(@PathVariable(value = "id")int id){
		//delete a record by id
		Customer cust = customerService.getCustomerId(id);
		customerService.deleteCustomer(cust);
		System.out.println("Customer with CustomerId : " + id + " deleted successfully");
	}

	
}