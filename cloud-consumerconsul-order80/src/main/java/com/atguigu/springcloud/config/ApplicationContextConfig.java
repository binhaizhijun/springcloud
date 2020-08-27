package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: ApplicationContextConfig
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/23 13:48
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced   //默认的负载均衡机制---轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
