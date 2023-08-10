package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.UUID;

@Configurable
public class Config {

    @Bean
    public Currency initializecy() {
        Currency inital = new Currency();
        inital.setCode("12");
        return inital;
    }

    @Bean
    public Current initializeCur() {
        Current inital = new Current();
        inital.setCurrency(initializecy());
        inital.setAmount(BigDecimal.ONE);
        inital.setAccountId(UUID.randomUUID());
        return inital;
    }

    ;

    @Bean
    public Saving initializeSa() {

        Saving inital = new Saving();
        inital.setCurrency(initializecy());
        inital.setAmount(BigDecimal.TEN);
        inital.setAccountId(UUID.randomUUID());

        return inital;
    }


}
