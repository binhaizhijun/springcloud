package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: OrderConsulController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/26 22:17
 */
@SpringBootApplication
@Slf4j
public class OrderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){

        return restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
    }
}
