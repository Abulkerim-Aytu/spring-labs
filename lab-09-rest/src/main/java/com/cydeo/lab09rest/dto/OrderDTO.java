package com.cydeo.lab09rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;

@Getter
@Setter
public class OrderDTO {
    private Long cartId;
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    private Long customerId;
    private Long paymentId;
    private Long id;
    private String currency;
}
