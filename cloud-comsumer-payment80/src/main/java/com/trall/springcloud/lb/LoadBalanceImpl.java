package com.trall.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 陈兵 on 2020/4/12.
 */
@Component
public class LoadBalanceImpl implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    public int getNext(){
        int next = 0;
        int current = 0;
        do{
            current = atomicInteger.get();
            next = current>Integer.MAX_VALUE?0:current+1;

        }while(!atomicInteger.compareAndSet(current,next));

        System.out.println("第几次访问,next:"+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> list) {
        if(list==null&&list.size()<0){
            return null;
        }
        int index = getNext()%list.size();
        ServiceInstance instance = list.get(index);
        return instance;
    }
}
