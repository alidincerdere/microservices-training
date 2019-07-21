package com.training.microservices.currencyexchangeservice.Controller;

import com.training.microservices.currencyexchangeservice.Model.ExchangeValue;
import com.training.microservices.currencyexchangeservice.Repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {


        /*
        ExchangeValue exchangeValue = new ExchangeValue(Long.valueOf(1), from, to, BigDecimal.valueOf(1000));


        */

        ExchangeValue exchangeValue = repository.findByFromAndTo(from,to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }

}
