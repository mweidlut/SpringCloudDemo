package org.test.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class MessageListener {

    private static Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @StreamListener(Sink.INPUT)
    public void input(Message<Company> message) {
        logger.warn("【*** 消息接收 ***】==>{}", message.getPayload());
    }

}