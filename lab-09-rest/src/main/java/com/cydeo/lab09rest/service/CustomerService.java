package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> listAllCustomer();
    CustomerDTO listAllCustomerByEmail(String email);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    CustomerDTO createCustomer(CustomerDTO customerDTO);



}
