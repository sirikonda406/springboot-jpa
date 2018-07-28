package com.mahesh.springboot.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDAO {

	@Autowired
	JdbcTemplate jdbcteplate;

	public List<Customer> findAll() {

		List<Customer> customerList =new ArrayList<Customer>();

		return customerList;
	}

	public void savePerson(Customer customer){



	}

}

