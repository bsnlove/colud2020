package com.trall.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by 陈兵 on 2020/5/10.
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication. class,args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                // Add a simple re-route from: /get to: http://httpbin.org:80
                // Add a simple "Hello:World" HTTP Header
                .route(p -> p.path("/guonei")
                                .uri("http://news.baidu.com/guonei")
                        ) // forward to httpbin
                .build();
    }
}
