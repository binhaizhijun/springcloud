package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: HystrixDashboardMain9001
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/2 23:07
 */
@SpringBootApplication
@EnableHystrixDashboard  //开启仪表盘
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
