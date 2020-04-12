package com.trall.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 陈兵 on 2020/4/12.
 */
@RestController
public class PaymentController {

    private static final String REQUEST_URL = "http://consul-provider";

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/payment/service")
    public String getService(){
       return restTemplate.getForObject(REQUEST_URL+"/payment/consul",String.class);
    }
}
