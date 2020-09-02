package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 22:59
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
