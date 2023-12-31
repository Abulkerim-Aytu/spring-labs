package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    CustomerDTO findById(Long customerId);
    boolean existById(Long customerId);
    List<CustomerDTO> readAll();
    CustomerDTO update(CustomerDTO customerDTO);
    CustomerDTO create(CustomerDTO customerDTO);
    CustomerDTO readByEmail(String email);

}
