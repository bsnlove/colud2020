package com.trall.springcloud.serviceImpl;

import com.trall.springCloud.entities.Payment;
import com.trall.springCloud.service.OrderPaymentService;
import com.trall.springcloud.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 陈兵 on 2020/3/31.
 */
@Service
public class PaymentServiceImpl implements OrderPaymentService {

    @Autowired
    public PaymentMapper mapper;

    @Override
    public int insert(Payment payment) {
        return mapper.insert(payment);
    }

    @Override
    public Payment select(Integer id) {
        Payment payment = new Payment();
        payment.setId(id);
        return mapper.selectOne(payment);
    }
}
