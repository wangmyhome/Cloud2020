package com.lollipop.springcloud.service;

import com.lollipop.springcloud.entities.CommonResult;
import com.lollipop.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/25 16:33
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
