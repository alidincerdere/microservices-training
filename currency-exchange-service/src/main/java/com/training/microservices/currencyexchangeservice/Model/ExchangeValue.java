package com.training.microservices.currencyexchangeservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by adere on 21.07.2019.
 */
@Entity
public class ExchangeValue {

    @Id
    private Long id;


    @Column(name = "currency_from")
    private String from;


    @Column(name = "currency_to")
    private String to;

    private BigDecimal exchangeFactor;

    private int port;

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

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
