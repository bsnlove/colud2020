package com.trall.springcloud.controller;

import com.trall.springcloud.service.FeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 陈兵 on 2020/4/26.
 */
@RestController
//@DefaultProperties(defaultFallback = "globalError")
public class PaymentController {

    @Resource
    FeignService feignService;

    @RequestMapping("/consumer/hystrix/ok/{id}")
    public String ok(@PathVariable("id") int id){
        return feignService.getResult(id);
    }

    @RequestMapping(value="/consumer/hystrix/timeout/{id}")
    //@HystrixCommand
    public String getTimeOut(@PathVariable("id") int id){
        String result = feignService.getTimeOut(id);
        System.out.print(result);
        return result;
    }

    public String globalError(){

        return "服务请求失败";
    }
}
