package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getCustomers(){
        return ResponseEntity.ok(new ResponseWrapper("true",customerService.listAllCustomer()));
    }

    @GetMapping("/{email}")
    public ResponseEntity<ResponseWrapper> getAddressListByStartsWithAddress(@PathVariable("email") String email){
        return ResponseEntity.ok(new ResponseWrapper("true",customerService.listAllCustomerByEmail(email)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createAddress(@RequestBody CustomerDTO customerDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", customerService.createCustomer(customerDTO)));
    }
//
//    @PutMapping
//    public ResponseEntity<ResponseWrapper> updateAddress(@RequestBody AddressDTO addressDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", addressService.updateAddress(addressDTO)));
//    }

}
