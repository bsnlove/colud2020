package com.trall.springcloud.controller;

import com.trall.springCloud.entities.CommonResult;
import com.trall.springCloud.entities.Payment;
import com.trall.springcloud.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 陈兵 on 2020/4/19.
 */
@RestController
@Slf4j
public class FeignController {

    @Resource
    FeignService feignService;

    @GetMapping("consumer/payment/{id}")
    public CommonResult<Payment> queryPayment(@PathVariable("id")Integer id){
        return feignService.queryPayment(id);
    }

    @RequestMapping(value="/consumer/hystrix/{id}")
    public String getTimeOut(@PathVariable("id") int id){
        String result = feignService.getTimeOut(id);
        System.out.print(result);
        return result;
    }
}
