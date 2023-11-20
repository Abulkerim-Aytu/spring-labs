package com.cydeo.lab09rest.controller;

import com.cydeo.lab09rest.dto.OrderDTO;
import com.cydeo.lab09rest.dto.ResponseWrapper;
import com.cydeo.lab09rest.entity.Order;
import com.cydeo.lab09rest.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderRepository) {
        this.orderService = orderRepository;
    }

    // Here if at requestParam parameter NOT required then we need to use Optional.
    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getOrders(@PathVariable("id") Long id,
                                                     @RequestParam(required = false,name ="currencies") Optional<String> currencies) throws Exception {
            OrderDTO order = orderService.findById(id, currencies);
            return ResponseEntity.ok(
                    ResponseWrapper.builder()
                            .code(200)
                            .success(true)
                            .message("Orders Are Found")
                            .data(order)
                            .build());
    }
}
