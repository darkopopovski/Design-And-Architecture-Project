package com.ukim.mk.demo15544543.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShoppingCartNotFoundException extends RuntimeException{

    public ShoppingCartNotFoundException(Long id) {
        super(String.format("Shopping cart with id: %d was not found", id));
    }
}
