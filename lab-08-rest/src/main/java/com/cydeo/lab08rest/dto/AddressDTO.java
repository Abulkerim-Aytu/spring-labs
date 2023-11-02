package com.cydeo.lab08rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO{

    @JsonIgnore
    private Long id;
    private String name;
    private String zipCode;
    private String street;
    private Long customerId;
}
