package com.trall.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 陈兵 on 2020/5/11.
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    String configInfo;

    @RequestMapping("/config")
    public String info(){

        return configInfo;
    }
}
