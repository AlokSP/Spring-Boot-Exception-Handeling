package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailAlreadyExistExcption extends RuntimeException {
    String message;

    public EmailAlreadyExistExcption(String message) {
        super(message);
        this.message = message;
    }

}
