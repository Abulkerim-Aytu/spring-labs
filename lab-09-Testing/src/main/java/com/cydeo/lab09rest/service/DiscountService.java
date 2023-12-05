package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {

    List<DiscountDTO> readAll();
    DiscountDTO update(DiscountDTO discountDTO);
    DiscountDTO create(DiscountDTO discountDTO);
    DiscountDTO readByName(String name);

}
