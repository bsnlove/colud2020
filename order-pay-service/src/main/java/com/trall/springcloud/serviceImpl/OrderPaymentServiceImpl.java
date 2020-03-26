package com.trall.springcloud.serviceImpl;

import com.trall.springCloud.entities.Payment;
import com.trall.springCloud.service.OrderPaymentService;
import com.trall.springcloud.mapper.OrderPaymentMapper;
import org.apache.ibatis.session.RowBounds;
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
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(Payment payment) {
        return delete(payment);
    }

    @Override
    public int insert(Payment payment) {
        return 0;
    }

    @Override
    public int insertSelective(Payment payment) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<Payment> selectAll() {
        return null;
    }

    @Override
    public Payment selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(Payment payment) {
        return 0;
    }

    @Override
    public List<Payment> select(Payment payment) {
        return null;
    }

    @Override
    public Payment selectOne(Payment payment) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Payment payment) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Payment payment) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List<Payment> selectByExample(Object o) {
        return null;
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public Payment selectOneByExample(Object o) {
        return null;
    }

    @Override
    public int updateByExample(Payment payment, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(Payment payment, Object o) {
        return 0;
    }

    @Override
    public List<Payment> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<Payment> selectByRowBounds(Payment payment, RowBounds rowBounds) {
        return null;
    }
}
