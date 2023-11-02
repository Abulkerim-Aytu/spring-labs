package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    List<DiscountDTO> listAllDiscount ();
    List<DiscountDTO> listAllDiscountByName (String name);
    DiscountDTO updateDiscount (DiscountDTO dto);
    DiscountDTO createDiscount (DiscountDTO dto);
}
