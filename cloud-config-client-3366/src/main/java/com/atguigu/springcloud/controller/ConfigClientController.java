package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: ConfigClientController
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/6 21:18
 */
@RestController
public class ConfigClientController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String configInfo(){
        return "serverPort: "+serverPort+"\t\n\n configIngo:"+configInfo;
    }
}
