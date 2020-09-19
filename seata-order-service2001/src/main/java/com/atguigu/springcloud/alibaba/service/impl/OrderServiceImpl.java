package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.service.impl
 * @ClassName: OrderServiceImpl
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/15 22:41
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
//    private OrderService orderService;
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;


    @Override
    public void create(Order order) {
        log.info("--------------->>>开始新建订单");
        orderDao.create(order);
        log.info(">>>>>>>>>>>>>>>>>订单微服务开始调用库存,做扣减count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info(">>>>>>>>>>>>>>>>>>>>>扣减结束");
        log.info(">>>>>>>>>>>>>>>>>订单微服务开始调用账户,做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info(">>>>>>>>>>>>>>>>>>>扣减结束");

        //4.修改订单状态,从0到1,
        log.info("------------>修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------------>下订单结束,😄");
    }
}
