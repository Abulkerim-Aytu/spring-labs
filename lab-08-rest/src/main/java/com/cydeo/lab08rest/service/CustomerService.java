package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> listAllCustomer();
    CustomerDTO listAllCustomerByEmail(String email);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    CustomerDTO createCustomer(CustomerDTO customerDTO);



}
