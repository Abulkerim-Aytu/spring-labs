package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> listAllAddress();
    List<AddressDTO>  listAllAddressesStartsWith(String keyWord);
    List<AddressDTO> listAllAddressByCustomerId(Long id);
    List<AddressDTO> listAllAddressByCustomerIdAndName(Long id, String name);
    AddressDTO createAddress(AddressDTO addressDTO);
    AddressDTO updateAddress(AddressDTO addressDTO);

}
