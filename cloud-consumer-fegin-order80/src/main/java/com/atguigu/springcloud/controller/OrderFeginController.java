package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: OrderFeginController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/31 21:13
 */
@RestController
@Slf4j
public class OrderFeginController {
    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
         return paymentFeginService.getPaymetById(id);
    }
}
