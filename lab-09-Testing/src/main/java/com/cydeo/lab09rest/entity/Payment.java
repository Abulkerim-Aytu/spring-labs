package com.cydeo.lab09rest.entity;

import com.cydeo.lab09rest.enums.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Payment extends BaseEntity{
    private BigDecimal paidPrice;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}
