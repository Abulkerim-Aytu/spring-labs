package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderRepository;

    public OrderController(OrderService orderRepository) {
        this.orderRepository = orderRepository;
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper> getOrders(){
        return ResponseEntity.ok(new ResponseWrapper("true",orderRepository.listAllAddress()));
    }

//    @GetMapping("/{name}")
//    public ResponseEntity<ResponseWrapper> getDiscountByName(@PathVariable("name") String name){
//        return ResponseEntity.ok(new ResponseWrapper("true",discountService.listAllDiscountByName(name)));
//    }
//
//    @PostMapping
//    public ResponseEntity<ResponseWrapper> createDiscount(@RequestBody DiscountDTO discountDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", discountService.createDiscount(discountDTO)));
//    }
//
//    @PutMapping
//    public ResponseEntity<ResponseWrapper> updateDiscount(@RequestBody DiscountDTO discountDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", discountService.updateDiscount(discountDTO)));
//    }

}
