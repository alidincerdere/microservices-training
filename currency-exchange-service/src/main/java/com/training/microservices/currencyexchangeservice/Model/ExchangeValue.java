package com.training.microservices.currencyexchangeservice.Model;

import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
public class ExchangeValue {

    private Long id;

    private String from;

    private String to;

    private BigDecimal exchangeFactor;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal exchangeFactor) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeFactor = exchangeFactor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getExchangeFactor() {
        return exchangeFactor;
    }

    public void setExchangeFactor(BigDecimal exchangeFactor) {
        this.exchangeFactor = exchangeFactor;
    }
}
