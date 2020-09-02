package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: cloud2020
 * @Package: service
 * @ClassName: PaymentFeginService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/31 20:50
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   //服务提供者注册咋在Eureka上的服务名
public interface PaymentFeginService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymetById(@PathVariable("id") Long id);
}
