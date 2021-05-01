package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findById(int orderId);

    List<Order> findOrdersByCustomerId(int customerId);
}
