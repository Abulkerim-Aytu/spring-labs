package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Config {

    @Bean
    public Current initializeCur (){
        return new Current();
    };

    @Bean
    public Saving initializeSa(){
        return new Saving();
    }


}
