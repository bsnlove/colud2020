package com.trall.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by 陈兵 on 2020/4/4.
 */
@RestController
public class PaymentContrller {

    @Value("${server.port}")
    String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String zk(){
        return "zookeeper"+serverPort+"--"+ UUID.randomUUID().toString();
    }
}
