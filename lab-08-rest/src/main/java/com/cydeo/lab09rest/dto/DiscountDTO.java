package com.cydeo.lab09rest.dto;

import com.cydeo.lab09rest.enums.DiscountType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DiscountDTO{
    private String name;
    private BigDecimal discount;
    private DiscountType discountType;
    private Long id;
}
