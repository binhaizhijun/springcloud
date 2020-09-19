package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.domain
 * @ClassName: Order
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/15 21:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    /**
     * 订单状态 :
     *  0: 创建中; 1:已完结;
     */
    private Integer status;
}
