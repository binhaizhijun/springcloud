package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.dao
 * @ClassName: OrderDao
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/15 21:42
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create (Order order);
    //2  修改订单状态
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
