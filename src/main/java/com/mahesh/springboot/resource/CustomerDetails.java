package com.mahesh.springboot.resource;

import com.mahesh.springboot.jpa.dao.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerDetails {

   @RequestMapping(value = "/customer/",method = RequestMethod.GET)
   public ResponseEntity<Customer> getCustomerDetails(){


       return new ResponseEntity<Customer>(new Customer(), HttpStatus.OK);
   }
}
