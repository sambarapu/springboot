package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Customer;
import com.javatechie.crud.example.entity.Order;
import com.javatechie.crud.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return service.getCustomerById(customerId);
    }

    @GetMapping("/name/{firstName}")
    public Customer getCustomerByName(@PathVariable String firstName){
        return service.getCustomerByName(firstName);
    }

    @GetMapping("/{customerId}/order")
    public OrderController getOrderController(@PathVariable int customerId){
        return new OrderController();
    }

    @GetMapping("/lastname/{lastName}")
    public List<Customer> getAllCustomersBylastName(@PathVariable String lastName){
        return service.getAllBylastName(lastName);
    }

}
