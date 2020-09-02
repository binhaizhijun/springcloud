package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 22:57
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
