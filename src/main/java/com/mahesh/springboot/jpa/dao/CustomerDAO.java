package com.mahesh.springboot.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {

	Customer getCustomersByCustomerId(Long customerId);

}

