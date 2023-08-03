package com.cydeo.loosely;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class CustomerBalance_1 extends Balance{

    public CustomerBalance_1(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    public BigDecimal addBalance(BigDecimal amount) {
        setAmount(amount);
        return amount;
    }
}
