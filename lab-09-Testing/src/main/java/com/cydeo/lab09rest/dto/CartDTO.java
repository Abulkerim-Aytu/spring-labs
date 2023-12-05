package com.cydeo.lab09rest.dto;

import com.cydeo.lab09rest.enums.CartState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDTO {
    private Long id;
    private CustomerDTO customer;
    private DiscountDTO discount;
    private CartState cartState;
}
