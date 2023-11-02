package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping
//    public ResponseEntity<ResponseWrapper> getOrders(){
//        return ResponseEntity.ok(new ResponseWrapper("true",orderRepository.listAllAddress()));
//    }
//
//    @GetMapping("/paymentMethod/{paymentMethod}")
//    public ResponseEntity<ResponseWrapper> getOrderByPaymentMethod(@PathVariable("paymentMethod") PaymentMethod paymentMethod){
//        return ResponseEntity.ok(new ResponseWrapper("true",orderRepository.listAllOrderByPaymentMethods(paymentMethod)));
//    }
//
//    @GetMapping("/email/{email}")
//    public ResponseEntity<ResponseWrapper> getOrderByEmail(@PathVariable("email") String email){
//        return ResponseEntity.ok(new ResponseWrapper("true",orderRepository.listAllOrderByEmail(email)));
//    }
//
//    @PostMapping
//    public ResponseEntity<ResponseWrapper> createOrder(@RequestBody OrderDTO orderDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", orderRepository.createOrder(orderDTO)));
//    }
//
//    @PutMapping
//    public ResponseEntity<ResponseWrapper> updateOrder(@RequestBody OrderDTO orderDTO){
//        return ResponseEntity.ok(new ResponseWrapper("true", orderRepository.updateOrder(orderDTO)));
//    }

}
