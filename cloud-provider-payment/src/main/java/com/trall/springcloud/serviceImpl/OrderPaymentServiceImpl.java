package com.trall.springcloud.serviceImpl;

import com.trall.springCloud.entities.Payment;
import com.trall.springCloud.service.OrderPaymentService;
import com.trall.springcloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
@Service
public class OrderPaymentServiceImpl implements OrderPaymentService {

    @Autowired
    public PaymentMapper paymentMapper;


    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment select(long id) {
        Payment payment = new Payment();
        payment.setId(id);
        return paymentMapper.selectOne(payment);
    }
}
