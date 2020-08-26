package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: OrderZKController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/25 23:32
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){

        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
