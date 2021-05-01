package com.javatechie.crud.example.dto.request;

import javax.validation.constraints.*;

public class LoginRequestDTO {

    @NotEmpty(message = "Name may not be empty")
    @NotBlank(message = "Name may not be blank")
    private String name;

    @NotNull(message = "Password may not be empty")
    @Size(min = 5, max=8)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
