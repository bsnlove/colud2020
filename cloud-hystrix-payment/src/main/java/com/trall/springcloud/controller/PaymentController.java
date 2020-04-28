package com.trall.springcloud.controller;

import com.trall.springcloud.controller.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by 陈兵 on 2020/4/20.
 */
@RestController
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @RequestMapping(value="/payment/{id}")
    public String getResult(@PathVariable("id") int id){
        return paymentService.getResult(id);
    }

    @GetMapping(value="/payment/timeout/{id}")
    public String getTimeOut(@PathVariable("id") int id){

        return paymentService.getTimeOut(id);
    }
}
