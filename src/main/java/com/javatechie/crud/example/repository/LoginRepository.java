package com.javatechie.crud.example.repository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javatechie.crud.example.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM User WHERE name = ?1", nativeQuery = true)
    User findUserByName(String user);


}
