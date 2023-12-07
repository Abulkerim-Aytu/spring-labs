package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.CustomerDTO;
import com.cydeo.lab09rest.entity.Customer;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.CustomerRepository;
import com.cydeo.lab09rest.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final MapperUtil mapperUtil;
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(MapperUtil mapperUtil, CustomerRepository customerRepository) {
        this.mapperUtil = mapperUtil;
        this.customerRepository = customerRepository;
    }

    public boolean existById(Long customerId) {
        return customerRepository.existsById(customerId);
    }

    @Override
    public CustomerDTO findById(Long customerId) {
        return customerRepository.findById(customerId).stream()
                .map(customer -> mapperUtil.convert(customer, new CustomerDTO())).findFirst().orElseThrow();
    }

    @Override
    public List<CustomerDTO> readAll() {
        return customerRepository.findAll().stream()
                .map(customer -> mapperUtil.convert(customer, new CustomerDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO update(CustomerDTO customerDTO) {
        Customer customer = customerRepository.save(mapperUtil.convert(customerDTO, new Customer()));
        return mapperUtil.convert(customer, new CustomerDTO());
    }

    @Override
    public CustomerDTO create(CustomerDTO customerDTO) {
        Customer customer = customerRepository.save(mapperUtil.convert(customerDTO, new Customer()));
        return mapperUtil.convert(customer, new CustomerDTO());
    }

    @Override
    public CustomerDTO readByEmail(String email) {
        return mapperUtil.convert(customerRepository.retrieveByCustomerEmail(email), new CustomerDTO());
    }

}