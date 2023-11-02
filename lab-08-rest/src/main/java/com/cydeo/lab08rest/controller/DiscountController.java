package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.CustomerDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.service.DiscountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/discount")
public class DiscountController {
    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

//    @GetMapping
//    public ResponseEntity<ResponseWrapper> getCustomers(){
//        return ResponseEntity.ok(new ResponseWrapper("true",customerService.listAllCustomer()));
//    }
//
//    @GetMapping("/{email}")
//    public ResponseEntity<ResponseWrapper> getAddressListByStartsWithAddress(@PathVariable("email") String email){
//        return ResponseEntity.ok(new ResponseWrapper("true",customerService.listAllCustomerByEmail(email)));
//    }
//
//    @PostMapping
//    public ResponseEntity<ResponseWrapper> createAddress(@RequestBody CustomerDTO customerDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", customerService.createCustomer(customerDTO)));
//    }
//
//    @PutMapping
//    public ResponseEntity<ResponseWrapper> updateAddress(@RequestBody CustomerDTO customerDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", customerService.updateCustomer(customerDTO)));
//    }

}
