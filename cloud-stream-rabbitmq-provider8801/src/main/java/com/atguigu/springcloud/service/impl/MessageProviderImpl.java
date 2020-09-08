package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: MessageProviderImpl
 * @Description: java类作用描述
 * @Author: 滨海之君
 * @CreateDate: 2020/9/7 20:34
 */
@EnableBinding(Source.class)  //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;  //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***********serial:"+serial);
        return null;
    }
}
