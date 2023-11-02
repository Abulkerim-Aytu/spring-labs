package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.dto.ResponseWrapper;
import com.cydeo.lab08rest.enums.PaymentMethod;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getProducts(){
        return ResponseEntity.ok(new ResponseWrapper("true",productService.listAllProduct()));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ResponseWrapper> getProductByName(@PathVariable("name") String name){
        return ResponseEntity.ok(new ResponseWrapper("true",productService.listAllProductByName(name)));
    }

    @GetMapping("/price/{price}")
    public ResponseEntity<ResponseWrapper> getProductByName(@PathVariable("price") BigDecimal price){
        return ResponseEntity.ok(new ResponseWrapper("true",productService.listAllProductByPrice(price)));
    }

    @GetMapping("/top3")
    public ResponseEntity<ResponseWrapper> getTop3Products(){
        return ResponseEntity.ok(new ResponseWrapper("true",productService.listTop3Product()));
    }

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
