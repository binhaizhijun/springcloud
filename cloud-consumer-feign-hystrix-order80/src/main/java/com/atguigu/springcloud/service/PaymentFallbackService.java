package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentFallbackService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/2 19:58
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallbackService,---paymentInfo_OK---fallback";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService,-----paymentInfo_TimeOut,----fallback-";
    }
}
