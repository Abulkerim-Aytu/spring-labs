package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.ProductDTO;
import com.cydeo.lab09rest.entity.Product;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.ProductRepository;
import com.cydeo.lab09rest.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
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
        List<Product> products = productRepository.retrieveProductListGreaterThanPriceAndLowerThanRemainingQuantity(price,quantity);
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public ProductDTO listAllProductByName(String name) {
        return mapperUtil.convert(productRepository.findFirstByName(name),new ProductDTO());
    }

    @Override
    public List<ProductDTO> listAllProductByCategory(Long id) {
        List<Product> products = productRepository.retrieveProductListByCategory(id);
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> listAllProductByPrice(BigDecimal price) {
        List<Product> products = productRepository.findAllByPrice(price);
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDTO())).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> listTop3Product() {
        List<Product> products = productRepository.findTop3ByOrderByPriceDesc();
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDTO())).collect(Collectors.toList());
    }


    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        productRepository.save(mapperUtil.convert(productDTO,new Product()));
        return productDTO;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Optional<Product> find = productRepository.findById(productDTO.getId());
        Product convert = mapperUtil.convert(productDTO,new Product());
        convert.setId(find.get().getId());
        productRepository.save(convert);
        return productDTO;
    }
}
