package com.mahesh.springboot.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAO {

	@Autowired
	JdbcTemplate jdbcteplate;

	public List<Person> findAll() {

		List<Person> personList =new ArrayList<Person>();

		return personList;
	}

	public void savePerson(Person person){



	}

}

