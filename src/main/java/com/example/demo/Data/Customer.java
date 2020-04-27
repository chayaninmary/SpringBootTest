package com.example.demo.Data;

/*
Name: Chayanin Petchdasda
Date: April 24, 2020  
Purpose of this class is related to employees table in a database.
Also, use Lombok library to minimize code Getter, Setter, Constructor w/ param and w/o param.
Below are all columns that contains in database (id is a key and auto count, firstname, lastname and email)	 
 */

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String name;
}