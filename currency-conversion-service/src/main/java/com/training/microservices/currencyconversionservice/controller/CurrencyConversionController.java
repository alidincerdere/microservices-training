package com.training.microservices.currencyconversionservice.controller;

import com.training.microservices.currencyconversionservice.model.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
@RestController
public class CurrencyConversionController {


    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean calculateValue(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

        CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(10000L, from, to, BigDecimal.valueOf(100), quantity, quantity, 0);


        return currencyConversionBean;
    }

}
