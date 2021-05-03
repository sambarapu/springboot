package com.javatechie.crud.example.Impl;

import com.javatechie.crud.example.entity.Customer;
import com.javatechie.crud.example.repository.CustomerRepository;
import com.javatechie.crud.example.exceptions.DataNotFoundException;
import com.javatechie.crud.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    private Log logger = LogFactory.getLog(CustomerServiceImpl.class);

    @Override
    public Customer getCustomerById(int id) {
        logger.info("In customer service Impl method for finding id : "+id);
        Customer customer = repository.findById(id);
        logger.info("validating customer response object with id : "+id);
        if (customer == null) {
            logger.error("customer not found: exception");
            throw new DataNotFoundException("No Customer with : "+ id +" Found");
        }
        return customer;
    }

    @Override
    public Customer getCustomerByName(String name) {
        logger.info("In customer-service Impl method for finding customer by firstname : "+name);
        Customer customer = repository.findCustomerByfirstName(name);
        logger.info("validating customer response object with: "+name);
        if(customer == null){
            logger.error("customer firstname not found: exception");
            throw new DataNotFoundException("No Customer with Firstname: "+ name +" Found");
        }
        return customer;
    }

    @Override
    public List<Customer> getAllBylastName(String name) {
        logger.info("In customer-service Impl method for finding customer by lastname : "+name);
        List<Customer> customer = repository.findCustomerByLastNameIsStartingWith(name);
        logger.info("validating customer response object with: "+name);
        if(customer == null){
            logger.error("customer  lastname not found: exception");
            throw new DataNotFoundException("No Customers with Lastname: "+ name +" Found");
        }
        return customer;
    }
}
