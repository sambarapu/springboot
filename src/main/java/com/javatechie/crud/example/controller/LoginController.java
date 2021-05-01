package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.dto.request.LoginRequestDTO;
import com.javatechie.crud.example.dto.response.LoginResponse;
import com.javatechie.crud.example.exceptions.DataNotFoundException;
import com.javatechie.crud.example.service.LoginService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginService service;

    private Log logger= LogFactory.getLog(LoginController.class);

    @PostMapping(value = "/login")
    public LoginResponse login(@Valid @RequestBody LoginRequestDTO requestDTO) {
        logger.info("validating request object ");
        String username= requestDTO.getName();
        String password= requestDTO.getPassword();
        return service.login(username, password);

    }

}
