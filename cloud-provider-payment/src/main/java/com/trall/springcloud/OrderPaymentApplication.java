package com.trall.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by hecny-it1 on 2020/3/20.
 */

@SpringBootApplication
@MapperScan(basePackages = "com.trall.springcloud.mapper")
@EnableEurekaClient
public class OrderPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderPaymentApplication.class,args);
    }
}
