package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Order;
import com.javatechie.crud.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order getOrderById(int id){
        return orderRepository.findById(id);
    }

    public List<Order> getOrdersById(int customerId){
        return orderRepository.findOrdersByCustomerId(customerId);
    }


}
