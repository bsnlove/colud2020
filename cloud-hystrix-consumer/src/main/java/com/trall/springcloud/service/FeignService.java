package com.trall.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 陈兵 on 2020/4/26.
 */
@Component
@FeignClient(value = "HYSTRIX-PAYMENT-SERVICE",fallback = FeignFallBackService.class)
public interface FeignService {

    @RequestMapping(value="/payment/{id}")
    public String getResult(@PathVariable("id") int id);

    @RequestMapping(value="/payment/timeout/{id}")
    public String getTimeOut(@PathVariable("id") int id);
}
