package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.AddressDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAddress(){
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Address are retrieved successfully.")
                .data(addressService.listAllAddress())
                .build());
    }

    @GetMapping("/startsWith/{address}")
    public ResponseEntity<ResponseWrapper> getAddressListByStartsWithAddress(@PathVariable("address") String address){
        return ResponseEntity.ok(new ResponseWrapper("true",addressService.listAllAddressesStartsWith(address)));
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<ResponseWrapper> getAddressListByStartsWithAddress(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("true",addressService.listAllAddressByCustomerId(id)));
    }

    @GetMapping("/customer/{customerId}/name/{name}")
    public ResponseEntity<ResponseWrapper> getAddressListByCustomerAndCustomerName(@PathVariable("customerId") Long customerId, @PathVariable("name") String name){
        return ResponseEntity.ok(new ResponseWrapper("true",addressService.listAllAddressByCustomerIdAndName(customerId,name)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createAddress(@RequestBody AddressDTO addressDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", addressService.createAddress(addressDTO)));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateAddress(@RequestBody AddressDTO addressDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", addressService.updateAddress(addressDTO)));
    }

}
