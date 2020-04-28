package com.trall.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by 陈兵 on 2020/4/26.
 */
@Component
public class FeignFallBackService implements FeignService {
    @Override
    public String getResult(int id) {
        return "---- fall back getResulto(╥﹏╥)o";
    }

    @Override
    public String getTimeOut(int time) {
        return "---- fall back getTimeOut(╥﹏╥)o";
    }
}
