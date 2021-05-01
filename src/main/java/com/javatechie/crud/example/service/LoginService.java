package com.javatechie.crud.example.service;

import com.javatechie.crud.example.dto.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

        LoginResponse login(String user, String password);
}
