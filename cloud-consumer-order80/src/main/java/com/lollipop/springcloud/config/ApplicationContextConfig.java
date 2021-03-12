package com.lollipop.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @Auther: shanpeng.wang
 * @Create: 2021/3/10 13:30
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced//使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
