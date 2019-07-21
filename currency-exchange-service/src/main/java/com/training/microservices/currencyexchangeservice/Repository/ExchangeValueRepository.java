package com.training.microservices.currencyexchangeservice.Repository;

import com.training.microservices.currencyexchangeservice.Model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by adere on 21.07.2019.
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
