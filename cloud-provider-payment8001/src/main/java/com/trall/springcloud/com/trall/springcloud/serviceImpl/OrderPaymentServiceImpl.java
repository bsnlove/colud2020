package com.trall.springcloud.com.trall.springcloud.serviceImpl;

import com.trall.springCloud.entities.Payment;
import com.trall.springCloud.service.OrderPaymentService;
import com.trall.springcloud.com.trall.springcloud.mapper.OrderPaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
@Service
public class OrderPaymentServiceImpl implements OrderPaymentService {

    @Autowired
    public OrderPaymentMapper orderPaymentMapper;


    @Override
    public int insert(Payment payment) {
        return orderPaymentMapper.insert(payment);
    }

    @Override
    public Payment select(long id) {
        Payment payment = new Payment();
        payment.setId(id);
        return orderPaymentMapper.selectOne(payment);
    }
}
