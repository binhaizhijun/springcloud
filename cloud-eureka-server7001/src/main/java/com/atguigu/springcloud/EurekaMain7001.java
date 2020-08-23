package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: EurekaMain7001
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/23 20:26
 */
@SpringBootApplication
@EnableEurekaServer  //声明这是一个Eureka服务端
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
