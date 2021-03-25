package com.lollipop.sprongcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lollipop.springcloud.entities.CommonResult;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/25 15:59
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
