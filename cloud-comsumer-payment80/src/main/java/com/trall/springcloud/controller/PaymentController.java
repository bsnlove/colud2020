package com.trall.springcloud.controller;

import com.trall.springCloud.entities.CommonResult;
import com.trall.springCloud.entities.Payment;
import com.trall.springcloud.lb.LoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@RestController
public class PaymentController {

    //private static final String REQEEST_PATH="http://localhost:8001";

    private static final String REQEEST_PATH="http://order-payment-service";

    @Autowired
    RestTemplate restTemplate;

    @Resource
    LoadBalance loadBalance;

    @Resource
    DiscoveryClient discoveryClient;

    @PostMapping("/payment")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(REQEEST_PATH+"/payment",payment,CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> queryPayment(@PathVariable("id")Integer id){
        return restTemplate.getForObject(REQEEST_PATH+"/payment/"+id,CommonResult.class);
    }

    @RequestMapping(value = "/comsumer/pyament/lb")
    public String getServerPort(){
        List<ServiceInstance> instances = discoveryClient.getInstances("order-payment-service");
        if(instances!=null&&instances.size()>0){
            ServiceInstance instance = loadBalance.instance(instances);
            URI uri = instance.getUri();
            return restTemplate.getForObject(uri+"/payment/lb",String.class);
        }
        return null;
    }
}
