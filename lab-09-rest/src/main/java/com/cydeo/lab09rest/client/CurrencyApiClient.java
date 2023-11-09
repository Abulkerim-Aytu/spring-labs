package com.cydeo.lab09rest.client;

import com.cydeo.lab09rest.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://currencylayer.com",name = "CURRENCY-CLIENT")

public interface CurrencyApiClient {

    @GetMapping("/live")
    OrderDTO getCurrentCurrency(@RequestParam(value = "access_key") String key, @RequestParam(value = "query") String value);
}

