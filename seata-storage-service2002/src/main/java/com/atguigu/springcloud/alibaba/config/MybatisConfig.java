package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.config
 * @ClassName: MybatisConfig
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/15 23:07
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MybatisConfig {
}
