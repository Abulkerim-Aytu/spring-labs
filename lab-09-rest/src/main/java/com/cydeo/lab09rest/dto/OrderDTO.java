package com.cydeo.lab09rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

@Getter
@Setter
public class OrderDTO {
    private Long cartId;
    private Double paidPrice;
    private Double totalPrice;
    private Long customerId;
    private Long paymentId;
    private Long id;
    private List<QuotesDTO> quotes;
}