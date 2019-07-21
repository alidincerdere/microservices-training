package com.training.microservices.currencyconversionservice.controller;

import com.training.microservices.currencyconversionservice.CurrencyExchangeServiceProxy;
import com.training.microservices.currencyconversionservice.model.CurrencyConversionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by adere on 21.07.2019.
 */
@RestController
public class CurrencyConversionController {


    @Autowired
    private CurrencyExchangeServiceProxy proxy;


    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean calculateValue(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

        //CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(10000L, from, to, BigDecimal.valueOf(100), quantity, quantity, 0);

        Map<String, String> uriVariables = new HashMap<>();

        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);

        CurrencyConversionBean response = responseEntity.getBody();

        CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(response.getId(), from, to, response.getExchangeFactor(), quantity, quantity.multiply(response.getExchangeFactor()), response.getPort());

        return currencyConversionBean;
    }


    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean calculateValueFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

        CurrencyConversionBean response = proxy.retrieveExchangeValue(from,to);

        CurrencyConversionBean currencyConversionBean = new CurrencyConversionBean(response.getId(), from, to, response.getExchangeFactor(), quantity, quantity.multiply(response.getExchangeFactor()), response.getPort());

        return currencyConversionBean;
    }
}
