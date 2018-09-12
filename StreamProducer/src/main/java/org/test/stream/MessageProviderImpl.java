package org.test.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息的发送管道


    @Override
    public void send(Company company) {
        this.output.send(MessageBuilder.withPayload(company).build()); // 创建并发送消息
    }
}
