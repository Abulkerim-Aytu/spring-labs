package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.ProductDTO;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    List<ProductDTO> listAllProduct();
    List<ProductDTO> listAllProductByPriceAndQuantity(BigDecimal price, Integer quantity);
    List<ProductDTO> listAllProductByCategory(Long id);
    List<ProductDTO> listAllProductByPrice(BigDecimal price);
    List<ProductDTO> listTop3Product();
    ProductDTO listAllProductByName(String name);
    ProductDTO updateProduct(ProductDTO productDTO);
    ProductDTO createProduct(ProductDTO productDTO);

}
