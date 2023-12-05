package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderRepository) {
        this.orderService = orderRepository;
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper> getOrders(){
        return ResponseEntity.ok(new ResponseWrapper("true",orderService.listAllAddress()));
    }

    @GetMapping("/paymentMethod/{paymentMethod}")
    public ResponseEntity<ResponseWrapper> getOrderByPaymentMethod(@PathVariable("paymentMethod") PaymentMethod paymentMethod){
        return ResponseEntity.ok(new ResponseWrapper("true",orderService.listAllOrderByPaymentMethods(paymentMethod)));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<ResponseWrapper> getOrderByEmail(@PathVariable("email") String email){
        return ResponseEntity.ok(new ResponseWrapper("true",orderService.listAllOrderByEmail(email)));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createOrder(@RequestBody OrderDTO orderDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", orderService.createOrder(orderDTO)));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateOrder(@RequestBody OrderDTO orderDTO){
        return ResponseEntity.ok(new ResponseWrapper("true", orderService.updateOrder(orderDTO)));
    }

    // Here if at requestParam parameter NOT required then we need to use Optional.
    @GetMapping("{orderId}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("orderId") Long orderId,
                                                   @RequestParam(value = "currency", required = false) Optional<String> currency) {

        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Order is retrieved successfully.")
                .data(orderService.readByOrderIdAndOptionalCurrency(orderId, currency))
                .build());

    }

}
