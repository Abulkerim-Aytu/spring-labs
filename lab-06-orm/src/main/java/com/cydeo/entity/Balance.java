package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor

public class Balance extends BaseEntity{

private int amount;

    @OneToOne
    private Customer customer;

    public Balance(int amount) {
        this.amount = amount;
    }
}
