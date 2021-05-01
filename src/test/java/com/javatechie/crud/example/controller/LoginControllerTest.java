package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.dto.response.LoginResponse;
import com.javatechie.crud.example.service.LoginService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LoginService loginService;

    @Test
    public void loginShouldReturnUserFromService() throws Exception{
        when(loginService.login("latha","latha")).thenReturn(createLoginResponse());
        this.mockMvc.perform(post("/login")).andDo(print()).andExpect(status().isOk());
    }

    private LoginResponse createLoginResponse() {
        LoginResponse loginResponse= new LoginResponse();
        loginResponse.setId(1);
        loginResponse.setName("latha");
        loginResponse.setPassword("latha");
        loginResponse.setRoles("ADMIN");
        return loginResponse;
    }
}
