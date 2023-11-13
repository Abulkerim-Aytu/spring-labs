package com.cydeo.lab09rest.client;

import com.cydeo.lab09rest.dto.CurrencyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://api.currencylayer.com/",name = "CURRENCIES-CLIENT")

public interface CurrencyApiClient {

    @GetMapping("/live")
    CurrencyDTO getCurrentCurrency(@RequestParam(value = "access_key") String key,
                                   @RequestParam(value = "currencies") String currency);
}

