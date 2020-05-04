package com.bookstore.demo.exception;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookException extends Exception {

    private String errorMessage;

    public BookException(String errorMessage) {
        super(errorMessage);
    }

}