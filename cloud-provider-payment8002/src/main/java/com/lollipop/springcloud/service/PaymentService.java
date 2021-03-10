package com.lollipop.springcloud.service;

import com.lollipop.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/10 11:06
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
