package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Order;
import com.javatechie.crud.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id){
        return service.getOrderById(id);
    }

    @GetMapping("/orders/{customerId}")
    public List<Order> getOrders(@PathVariable int customerId){
        return service.getOrdersById(customerId);
    }

}
