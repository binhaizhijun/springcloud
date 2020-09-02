package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderFeginMain80
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/31 20:42
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain80.class,args);
    }
}
