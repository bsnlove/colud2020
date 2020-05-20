package com.trall.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@Configuration
public class MyConfig {

    @Bean
    //@LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }


}
