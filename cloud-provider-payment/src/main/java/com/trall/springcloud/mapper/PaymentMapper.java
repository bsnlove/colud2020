package com.trall.springcloud.mapper;

import com.trall.springCloud.entities.Payment;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by hecny-it1 on 2020/3/20.
 */
@Repository
public interface PaymentMapper extends Mapper<Payment> {


}
