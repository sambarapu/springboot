package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Customer;
import com.javatechie.crud.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer getCustomerById(int id){
        return repository.findById(id);
    }

    public Customer getCustomerByName(String name){
        return repository.findCustomerByfirstName(name);
    }

    public List<Customer> getAllBylastName(String name){
        return repository.findCustomerByLastNameIsStartingWith(name);
    }

}
