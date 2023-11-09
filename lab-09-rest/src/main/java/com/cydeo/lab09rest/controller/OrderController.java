package com.cydeo.lab09rest.controller;

import com.cydeo.lab09rest.dto.ResponseWrapper;
import com.cydeo.lab09rest.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderRepository) {
        this.orderService = orderRepository;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getOrders(@PathVariable("id") Long id){
        return ResponseEntity.ok(new ResponseWrapper("true",orderService.findById(id)));
    }

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
