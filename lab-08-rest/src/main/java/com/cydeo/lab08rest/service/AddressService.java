package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.dto.CustomerDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> listAllAddress();
    List<AddressDTO>  listAllAddressesStartsWith(String keyWord);
    List<AddressDTO> listAllAddressByCustomerId(Long id);
    List<AddressDTO> listAllAddressByCustomerIdAndName(Long id, String name);
    AddressDTO createAddress(AddressDTO addressDTO);
    AddressDTO UpdateAddress(AddressDTO addressDTO);

}
