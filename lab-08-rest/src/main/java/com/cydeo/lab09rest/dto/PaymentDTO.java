package com.cydeo.lab09rest.dto;

import com.cydeo.lab09rest.enums.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentDTO {
    private BigDecimal paidPrice;
    private PaymentMethod paymentMethod;
}
