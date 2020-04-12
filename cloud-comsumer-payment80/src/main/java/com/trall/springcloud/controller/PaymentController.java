package com.trall.springcloud.controller;

import com.trall.springCloud.entities.CommonResult;
import com.trall.springCloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@RestController
public class PaymentController {

    //private static final String REQEEST_PATH="http://localhost:8001";

    private static final String REQEEST_PATH="http://order-payment-service";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/payment")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(REQEEST_PATH+"/payment",payment,CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> queryPayment(@PathVariable("id")Integer id){
        return restTemplate.getForObject(REQEEST_PATH+"/payment/"+id,CommonResult.class);
    }
}
