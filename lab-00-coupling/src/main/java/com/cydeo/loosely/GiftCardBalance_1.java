package com.cydeo.loosely;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.UUID;

@Getter
@Setter
public class GiftCardBalance_1 extends Balance {

    public GiftCardBalance_1(UUID userId, BigDecimal amount) {
        super(userId, amount);
    }

    public BigDecimal addBalance(BigDecimal amount) {
        BigDecimal bonusAmount =
                amount.multiply(BigDecimal.TEN)
                        .divide(new BigDecimal(100)
                                , MathContext.DECIMAL64);

        setAmount(amount.add(bonusAmount));
        return amount;
    }
}
