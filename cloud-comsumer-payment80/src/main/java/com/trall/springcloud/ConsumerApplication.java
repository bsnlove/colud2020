package com.trall.springcloud;

import com.trall.springcloud.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "myRibbon",configuration = MyConfig.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
