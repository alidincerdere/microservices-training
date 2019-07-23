package com.training.microservices.netflixzuulapigatewayserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by adere on 23.07.2019.
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter {


    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @Override
    public String filterType() {
        return "pre";
        //return "post";
        //return "error";
    }

    @Override
    public int filterOrder() {
        //priority
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();


        logger.info("request -> {}, uri -> {}", request, request.getRequestURI());

        return null;
    }
}
