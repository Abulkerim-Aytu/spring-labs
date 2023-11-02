package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping()
    public ResponseEntity<ResponseWrapper> getAddress(){
        return ResponseEntity.ok(new ResponseWrapper("true",addressService.listAllAddress()));
    }



}
