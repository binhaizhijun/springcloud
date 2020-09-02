package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentService
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/1 20:30
 */
@Service
public class PaymentService {

    /**
     * 模拟正常访问的业务
     * @param id
     * @return
     */
    public String payemntInfo_OK(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_OK,id: "+id+"\t"+"😄";
    }

    /**
     * 模拟超时业务
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "payemntInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "10000")
    })
    public String payemntInfo_TimeOut(Integer id){
     //   int a=10/0;
        int timeNumber=5000;
        try {
            TimeUnit.MICROSECONDS.sleep(13000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"😄"+"耗时(s):";
    }
    public String payemntInfo_TimeOutHandler(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"paymentInfo_TimeOut,id: "+id+"\t"+"o(╥﹏╥)o";
    }

    //========服务熔断===========
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id < 0){
            throw new RuntimeException("*****id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " +id;
    }

}
