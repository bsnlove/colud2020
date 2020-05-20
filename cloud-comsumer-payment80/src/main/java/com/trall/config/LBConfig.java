package com.trall.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 陈兵 on 2020/4/12.
 */
@Configuration
public class LBConfig {

    @Bean
    public IRule getLB(){

        return new RoundRobinRule();
    }
}
