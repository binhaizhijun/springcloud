package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: PaymentDao
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 22:34
 */
@Mapper
//@Repository  这个注解有时会出错,推荐用@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
