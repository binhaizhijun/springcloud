package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.controller
 * @ClassName: FlowLimitController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/13 21:25
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "----------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "----------testB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "--------testHotKey";
    }
    public String deal_testHotKey(String p1, String p2, BlockException e){
        return "---------deal_testHotKey,ku";
    }

}
