package com.cydeo.lab09rest.exception;

public class CurrencyInvalidException extends RuntimeException {

    public CurrencyInvalidException(String message) {
        super(message);
    }

}