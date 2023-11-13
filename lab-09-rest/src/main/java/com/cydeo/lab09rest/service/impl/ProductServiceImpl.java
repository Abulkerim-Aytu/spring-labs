package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.ProductDTO;
import com.cydeo.lab09rest.dto.ProductRequest;
import com.cydeo.lab09rest.entity.Product;
import com.cydeo.lab09rest.exception.ProductNotFoundException;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.ProductRepository;
import com.cydeo.lab09rest.service.ProductService;
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
    public ProductDTO create(ProductDTO productDTO) {
        Product productToSave = mapperUtil.convert(productDTO, new Product());
        Product savedProduct = productRepository.save(productToSave);
        return mapperUtil.convert(savedProduct, new ProductDTO());
    }

    @Override
    public List<ProductDTO> readAll() {
        return productRepository.findAll().stream()
                .map(product -> mapperUtil.convert(product, new ProductDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> readTop3() {
        return productRepository.findTop3ByOrderByPriceDesc().stream()
                .map(product -> mapperUtil.convert(product, new ProductDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO readByProductName(String productName) {
        Product foundProduct = productRepository.findFirstByName(productName);
        return mapperUtil.convert(foundProduct, new ProductDTO());
    }

    @Override
    public List<ProductDTO> readAllByCategoryId(Long categoryId) {
        return productRepository.retrieveProductListByCategory(categoryId).stream()
                .map(product -> mapperUtil.convert(product, new ProductDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public Integer countAllByPrice(BigDecimal price) {
        return productRepository.countProductByPriceGreaterThan(price);
    }

    @Override
    public List<ProductDTO> readAllByCategoriesAndPrice(ProductRequest productRequest) {
        return productRepository.retrieveProductListByCategoryAndPrice(productRequest.getCategoryList(), productRequest.getPrice())
                .stream()
                .map(product -> mapperUtil.convert(product, new ProductDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {

        Product foundProduct = productRepository.findById(productDTO.getId())
                .orElseThrow(() -> new ProductNotFoundException("No Product Found!"));

        Product productToUpdate = mapperUtil.convert(productDTO, new Product());
        productToUpdate.setId(foundProduct.getId());

        Product updatedProduct = productRepository.save(productToUpdate);

        return mapperUtil.convert(updatedProduct, new ProductDTO());
    }

}