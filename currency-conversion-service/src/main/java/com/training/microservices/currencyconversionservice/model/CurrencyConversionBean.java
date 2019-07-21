package com.training.microservices.currencyconversionservice.model;

import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
public class CurrencyConversionBean {

    private Long id;

    private String from;

    private String to;

    private BigDecimal exchangeFactor;

    private BigDecimal quantity;

    private BigDecimal totalValue;

    private int port;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal exchangeFactor, BigDecimal quantity, BigDecimal totalValue, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.exchangeFactor = exchangeFactor;
        this.quantity = quantity;
        this.totalValue = totalValue;
        this.port = port;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
