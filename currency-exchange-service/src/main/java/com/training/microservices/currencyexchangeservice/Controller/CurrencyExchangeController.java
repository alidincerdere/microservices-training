package com.training.microservices.currencyexchangeservice.Controller;

import com.training.microservices.currencyexchangeservice.Model.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}/{value}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to, @PathVariable double value) {

        return new ExchangeValue(Long.valueOf(1), from, to, BigDecimal.valueOf(1000));
    }

}
