package com.trall.springcloud.service;

import com.trall.springCloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 陈兵 on 2020/4/19.
 */
@Component
@FeignClient(name = "ORDER-PAYMENT-SERVICE")
public interface FeignService {

    @GetMapping("payment/{id}")
    public CommonResult queryPayment(@PathVariable("id")long id);

    @RequestMapping("payment/result/{id}")
    public String getTimeOut(@PathVariable("id") Integer id);
}
