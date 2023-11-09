package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.CustomerDTO;
import com.cydeo.lab09rest.entity.Customer;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.CustomerRepository;
import com.cydeo.lab09rest.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final MapperUtil mapperUtil;

    public CustomerServiceImpl(CustomerRepository customerRepository, MapperUtil mapperUtil) {
        this.customerRepository = customerRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<CustomerDTO> listAllCustomer() {
        List<Customer> customer1 = customerRepository.findAll();
        return customer1.stream().map(customer ->mapperUtil.convert(customer,new CustomerDTO())).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO listAllCustomerByEmail(String email) {
        return mapperUtil.convert(customerRepository.retrieveByCustomerEmail(email),new CustomerDTO());
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        Optional<Customer> find = customerRepository.findById(customerDTO.getId());

        Customer convert = mapperUtil.convert(customerDTO,new Customer());

        convert.setId(find.get().getId());

        customerRepository.save(convert);

        return customerDTO;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        customerRepository.save(mapperUtil.convert(customerDTO,new Customer()));
        return customerDTO;
    }
}
