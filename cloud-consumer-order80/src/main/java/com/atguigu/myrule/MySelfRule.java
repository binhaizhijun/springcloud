package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.myrule
 * @ClassName: MySelfRule
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/27 23:26
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
