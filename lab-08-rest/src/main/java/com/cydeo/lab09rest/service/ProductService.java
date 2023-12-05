package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.ProductDTO;
import com.cydeo.lab09rest.dto.ProductRequest;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    ProductDTO create(ProductDTO productDTO);
    List<ProductDTO> readAll();
    List<ProductDTO> readTop3();
    ProductDTO readByProductName(String productName);
    List<ProductDTO> readAllByCategoryId(Long categoryId);
    Integer countAllByPrice(BigDecimal price);
    List<ProductDTO> readAllByCategoriesAndPrice(ProductRequest productRequest);
    ProductDTO update(ProductDTO productDTO);

}