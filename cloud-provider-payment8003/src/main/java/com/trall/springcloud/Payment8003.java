package com.trall.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 陈兵 on 2020/4/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8003 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class,args);
    }
}
