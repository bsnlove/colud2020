package com.trall.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created by 陈兵 on 2020/4/12.
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> list);
}
