package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.service
 * @ClassName: AccountService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 20:34
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
