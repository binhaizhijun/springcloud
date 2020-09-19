package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.dao
 * @ClassName: AccountDao
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 20:21
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
