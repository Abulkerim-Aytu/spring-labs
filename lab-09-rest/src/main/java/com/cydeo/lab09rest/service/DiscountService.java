package com.cydeo.lab09rest.service;

import com.cydeo.lab09rest.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    List<DiscountDTO> listAllDiscount ();
    DiscountDTO listAllDiscountByName (String name);
    DiscountDTO updateDiscount (DiscountDTO dto);
    DiscountDTO createDiscount (DiscountDTO dto);
}
