package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor


public class Orders extends BaseEntity{

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Cart cart;

    @OneToOne
    private Payment payment;
    public Orders(BigDecimal paidPrice, BigDecimal totalPrice) {
        this.paidPrice = paidPrice;
        this.totalPrice = totalPrice;
    }
}
