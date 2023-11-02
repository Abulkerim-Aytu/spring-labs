package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.entity.Address;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.AddressRepository;
import com.cydeo.lab08rest.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final MapperUtil mapperUtil;

    public AddressServiceImpl(AddressRepository addressRepository, MapperUtil mapperUtil) {
        this.addressRepository = addressRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<AddressDTO> listAllAddress() {
        List<Address> address= addressRepository.findAll();
        return address.stream().map(addresses -> mapperUtil.convert(address,new AddressDTO())).collect(Collectors.toList());
    }

    @Override
    public List<AddressDTO> listAllAddressesStartsWith(String keyWord) {
        List<Address> address= addressRepository.findAllByStreetStartingWith(keyWord);
        return address.stream().map(address1 -> mapperUtil.convert(address, new AddressDTO())).collect(Collectors.toList());
    }

    @Override
    public List<AddressDTO> listAllAddressByCustomerId(Long id) {
        List<Address> address= addressRepository.retrieveByCustomerId(id);
        return address.stream().map(address1 -> mapperUtil.convert(address, new AddressDTO())).collect(Collectors.toList());
    }
}
