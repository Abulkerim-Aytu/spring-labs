package com.cydeo;
import com.cydeo.loosely.Balance;
import com.cydeo.loosely.CustomerBalance_1;
import com.cydeo.loosely.GiftCardBalance_1;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID user = UUID.randomUUID();

        Balance customerBalance = new CustomerBalance_1(user, BigDecimal.ZERO);
        Balance giftCardBalance = new GiftCardBalance_1(user, BigDecimal.ZERO);

        customerBalance.addBalance(new BigDecimal(150));
        giftCardBalance.addBalance(new BigDecimal(120));

        BalanceManager balanceManager = new BalanceManager(customerBalance);
        BalanceManager balanceManager1 = new BalanceManager(giftCardBalance);

        System.out.println(balanceManager.checkout(new BigDecimal(80)));
        System.out.println(balanceManager1.checkout(new BigDecimal(-80)));
    }

}
