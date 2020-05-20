package com.trall.springCloud.service;

import com.trall.springCloud.entities.Payment;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
public interface OrderPaymentService {

    public int insert(Payment payment);

    public Payment select(Integer id);
}
