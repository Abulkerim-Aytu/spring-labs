package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.AddressDTO;
import com.cydeo.lab09rest.repository.AddressRepository;
import com.cydeo.lab09rest.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//---------------Unit-Test---------------

@ExtendWith(MockitoExtension.class)
class AddressServiceImplTest {

    @Mock
    private AddressRepository addressRepository;

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private AddressServiceImpl addressService;

//  Address Update Methods
    @Test
    public void should_not_update_the_address_when_customer_not_found(){
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCustomerId(1L);

        when(customerService.existById(addressDTO.getCustomerId())).thenReturn(true);
        Throwable throwable = catchThrowable(() -> addressService.update(new AddressDTO()));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }



}