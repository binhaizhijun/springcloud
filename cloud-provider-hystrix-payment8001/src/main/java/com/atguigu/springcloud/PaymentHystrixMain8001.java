package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: PaymentHystrixMain8001
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/1 20:25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker   //熔断器注解
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
