package com.javatechie.crud.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UserCredentialsDoNotMatchException extends RuntimeException {
    public UserCredentialsDoNotMatchException(String message) {
        super(message);
    }
}
