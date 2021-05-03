package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Customer;
import com.javatechie.crud.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    private Log logger = LogFactory.getLog(CustomerController.class);

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        logger.info("request for customer by id:" +customerId);
        return service.getCustomerById(customerId);
    }

    @GetMapping("/name/{firstName}")
    public Customer getCustomerByName(@PathVariable String firstName){
        logger.info("request for customer by firstname:" +firstName);
        return service.getCustomerByName(firstName);
    }

   /* @GetMapping("/{customerId}/order")
    public OrderController getOrderController(@PathVariable int customerId){
        return new OrderController();
    }
*/
    @GetMapping("/lastname/{lastName}")
    public List<Customer> getAllCustomersBylastName(@PathVariable String lastName){
        logger.info("request for customer by lastname:" +lastName);
        return service.getAllBylastName(lastName);
    }

}
