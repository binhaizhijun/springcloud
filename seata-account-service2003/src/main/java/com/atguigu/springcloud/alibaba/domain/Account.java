package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.domain
 * @ClassName: Account
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 20:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private Long userId;

    private BigDecimal total;

    private BigDecimal used;

    private BigDecimal residue;
}
