package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: PaymentController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/8/22 23:02
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("**************插入结果"+result);
        if(result>0){
            return new CommonResult(200,"插入数据成功,serverPort "+port,payment);
        }else {
            return new CommonResult(444,"插入数据失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("************查询结果:"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功,serverPort "+port,payment);
        }else {
            return new CommonResult(444,"没有查询到数据,查询的id:"+id);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discover(){
        List<String> services = discoveryClient.getServices();//得到服务清单列表
        for (String element:services
             ) {
            log.info("**********element"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance:instances){
            log.info(instance.getInstanceId()+"\t"+instance.getUri()+"\t"+instance.getPort());
        }
        return this.discoveryClient;
    }
    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "hi,i'am paymentzipkin server fallback...";
    }
}
