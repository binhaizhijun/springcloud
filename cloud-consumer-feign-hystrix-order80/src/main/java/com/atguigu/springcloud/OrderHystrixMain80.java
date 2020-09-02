package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderHystrixMain80
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/1 21:19
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker

public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
