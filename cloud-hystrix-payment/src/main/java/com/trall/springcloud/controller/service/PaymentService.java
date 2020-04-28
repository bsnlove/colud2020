package com.trall.springcloud.controller.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by 陈兵 on 2020/4/20.
 */
@Service
public class PaymentService {

    public String getResult(int id){
//        try {
//            TimeUnit.SECONDS.sleep(id);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return "线程"+Thread.currentThread().getName()+"^_^耗时"+id+"秒";
    }


    public String getTimeOut(int time){
        try {
            TimeUnit.SECONDS.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "线程"+Thread.currentThread().getName()+"耗时"+time+"秒";
    }

    public String errorHandler(int id){

        return "线程"+Thread.currentThread().getName()+"请求失败";
    }
}
