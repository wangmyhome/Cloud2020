package com.lollipop.springcloud.service.impl;

import com.lollipop.springcloud.dao.PaymentDao;
import com.lollipop.springcloud.entities.Payment;
import com.lollipop.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/10 11:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
