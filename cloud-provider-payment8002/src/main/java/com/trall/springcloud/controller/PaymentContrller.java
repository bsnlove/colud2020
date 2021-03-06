package com.trall.springcloud.controller;

import com.trall.springCloud.entities.CommonResult;
import com.trall.springCloud.entities.Payment;
import com.trall.springCloud.service.OrderPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 陈兵 on 2020/3/29.
 */
@RestController
public class PaymentContrller {

    @Autowired
    OrderPaymentService orderPaymentService;

    @Value("${server.port}")
    private String servPort;

    @PostMapping("payment")
    public CommonResult addPayment(@RequestBody Payment payment){
        int insert = orderPaymentService.insert(payment);
        CommonResult result = new CommonResult();
        if(insert>0){
            result.setCode(200);
            result.setMessage("插入成功");
        }else{
            result.setCode(400);
            result.setMessage("插入失败");
        }

        return result;
    }

    @GetMapping("payment/{id}")
    public CommonResult queryPayment(@PathVariable("id")Integer id){
        Payment payment = orderPaymentService.select(id);
        CommonResult result = new CommonResult();

        if(payment!=null){
            result.setCode(200);
            result.setMessage("成功"+servPort);
            result.setData(payment);
        }else{
            result.setCode(400);
            result.setMessage("id为"+id+"的信息未找到。");
        }
        return result;
    }
}
