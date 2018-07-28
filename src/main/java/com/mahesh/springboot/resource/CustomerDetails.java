package com.mahesh.springboot.resource;

import com.mahesh.springboot.jpa.dao.Customer;
import com.mahesh.springboot.jpa.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class CustomerDetails {

    @Autowired
    private CustomerDAO customerDAO;

   @RequestMapping(value = "/customer/",method = RequestMethod.GET)
   public ResponseEntity<Customer> getCustomerDetails(@PathParam("customerId") String customerId){

       System.out.println("customer Id --->"+customerId);

       Customer customer= customerDAO.getCustomersByCustomerId(Long.valueOf(customerId));

       System.out.println("customer details ---> "+customer);

       return new ResponseEntity<>(customer, HttpStatus.OK);
   }
}
