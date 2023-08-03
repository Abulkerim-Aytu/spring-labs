package com.cydeo.loosely;


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
