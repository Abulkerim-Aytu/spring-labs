package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.entity.Product;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.ProductRepository;
import com.cydeo.lab08rest.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final MapperUtil mapperUtil;

    public ProductServiceImpl(ProductRepository productRepository, MapperUtil mapperUtil) {
        this.productRepository = productRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<ProductDTO> listAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> listAllProductByPriceAndQuantity(BigDecimal price, Integer quantity) {
        return null;
    }

    @Override
    public List<ProductDTO> listAllProductByName(String name) {
        return null;
    }

    @Override
    public List<ProductDTO> listAllProductByCategory(Long id) {
        return null;
    }

    @Override
    public List<ProductDTO> listAllProductByPrice(BigDecimal price) {
        return null;
    }

    @Override
    public List<ProductDTO> listTop3Product() {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return null;
    }
}
