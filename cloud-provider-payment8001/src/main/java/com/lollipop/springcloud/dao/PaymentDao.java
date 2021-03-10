package com.lollipop.springcloud.dao;

import com.lollipop.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/10 11:04
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
