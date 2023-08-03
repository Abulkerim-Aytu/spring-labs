package com.cydeo;


import com.cydeo.loosely.Balance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

public class BalanceManager {


    public boolean checkout(Balance balance,BigDecimal checkAmount
        // add method parameters
    ) {

        return balance.getAmount().subtract(checkAmount).compareTo(BigDecimal.ZERO) > 0;
        // implement checkout business
    }
}
