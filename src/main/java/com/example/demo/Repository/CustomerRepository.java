package com.example.demo.Repository;

/*
Name: Chayanin Petchdasda
Date: April 24, 2020  
Purpose: Responsible for communication with the used data storage, which is customers table in Postgresql.
This is an interface class that extends JpaRepository interface.
Therefore, CustomerRepository will be used to access data from Postgresql.
For CRUD (create, read, update and delete) operation is already supported by Spring boot by default, as 
our CustomerRepository interface is extending JpaRepository interface. 
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Data.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findById(int id);

}