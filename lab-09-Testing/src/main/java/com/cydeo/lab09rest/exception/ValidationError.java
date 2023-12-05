package com.cydeo.lab09rest.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ValidationError {

    private String errorField;
    private Object rejectedValue;
    private String reason;

}
