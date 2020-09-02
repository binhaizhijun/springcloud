package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: FeignConfig
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/31 22:16
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
