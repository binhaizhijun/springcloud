package com.atguigu.springcloud.alibaba.service;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba
 * @ClassName: StorageService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/18 19:48
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
