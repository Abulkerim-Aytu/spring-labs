package com.cydeo;


import com.cydeo.loosely.Balance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public class BalanceManager {

    private Balance balance;

    public BalanceManager(Balance balance) {
        this.balance = balance;
    }

    public boolean checkout(BigDecimal balance
        // add method parameters
    ) {
        BigDecimal balanceAmount = balance;

        return balanceAmount.compareTo(BigDecimal.ZERO) > 0;
        // implement checkout business
    }
}
