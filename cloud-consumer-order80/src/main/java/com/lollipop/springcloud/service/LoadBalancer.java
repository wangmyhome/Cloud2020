package com.lollipop.springcloud.service;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/12 10:40
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
