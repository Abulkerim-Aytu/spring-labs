package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.DiscountDTO;
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

    @GetMapping
    public ResponseEntity<ResponseWrapper> getDiscounts(){
        return ResponseEntity.ok(new ResponseWrapper("true",discountService.listAllDiscount()));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ResponseWrapper> getDiscountByName(@PathVariable("name") String name){
        return ResponseEntity.ok(new ResponseWrapper("true",discountService.listAllDiscountByName(name)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createDiscount(@RequestBody DiscountDTO discountDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", discountService.createDiscount(discountDTO)));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateDiscount(@RequestBody DiscountDTO discountDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", discountService.updateDiscount(discountDTO)));
    }

}
