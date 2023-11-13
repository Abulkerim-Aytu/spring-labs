package com.cydeo.lab09rest.controller;

import com.cydeo.lab09rest.dto.ProductDTO;
import com.cydeo.lab09rest.dto.ProductRequest;
import com.cydeo.lab09rest.model.ResponseWrapper;
import com.cydeo.lab09rest.service.ProductService;
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

    @PostMapping
    public ResponseEntity<ResponseWrapper> create(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Product is created successfully.")
                .data(productService.create(productDTO))
                .build());
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> update(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Product is updated successfully.")
                .data(productService.update(productDTO))
                .build());
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAll() {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Products are retrieved successfully.")
                .data(productService.readAll())
                .build());
    }

    @GetMapping("/top3")
    public ResponseEntity<ResponseWrapper> getTop3() {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Products are retrieved successfully.")
                .data(productService.readTop3())
                .build());
    }

    @GetMapping("/{productName}")
    public ResponseEntity<ResponseWrapper> getByName(@PathVariable("productName") String productName) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Product is retrieved successfully.")
                .data(productService.readByProductName(productName))
                .build());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<ResponseWrapper> getAllByCategoryId(@PathVariable("categoryId") Long categoryId) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Products are retrieved successfully.")
                .data(productService.readAllByCategoryId(categoryId))
                .build());
    }

    @GetMapping("/price/{price}")
    public ResponseEntity<ResponseWrapper> countAllByPrice(@PathVariable("price") BigDecimal price) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Product count is calculated successfully.")
                .data(productService.countAllByPrice(price))
                .build());
    }

    @PostMapping("/categoryandprice")
    public ResponseEntity<ResponseWrapper> getAllByCategoriesAndPrice(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(ResponseWrapper.builder()
                .code(200)
                .success(true)
                .message("Products are retrieved successfully.")
                .data(productService.readAllByCategoriesAndPrice(productRequest))
                .build());
    }

}