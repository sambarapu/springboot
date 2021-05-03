package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Customer;
import java.util.List;

public interface CustomerService {

    Customer getCustomerById(int id);

    Customer getCustomerByName(String name);

    List<Customer> getAllBylastName(String name);

}
