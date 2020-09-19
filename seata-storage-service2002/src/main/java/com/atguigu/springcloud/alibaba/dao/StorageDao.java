package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.dao
 * @ClassName: StorageDao
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 19:40
 */
@Mapper
public interface StorageDao {
    //扣减库存

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
