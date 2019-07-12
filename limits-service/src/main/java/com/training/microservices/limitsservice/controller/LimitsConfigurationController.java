package com.training.microservices.limitsservice.controller;

import com.training.microservices.limitsservice.Configuration;
import com.training.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adere on 12.07.2019.
 */

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public LimitConfiguration retriveLimitConfigurations() {

        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

}
