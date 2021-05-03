package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findById(int id);

    Customer findCustomerByfirstName(String name);

    @Query("select c from Customer c where c.lastName LIKE CONCAT('%',:lastName,'%')")
    List<Customer> findCustomerByLastNameIsStartingWith(@Param("lastName") String lastName);

    /*@Query(value = "select c from customers c where c.last_name like %?1")
    List<Customer> findAllBylastName(String lastName);*/
}
