package org.test.stream;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StreamProducerApplication.class)
@WebAppConfiguration
public class TestMessageProvider {
    @Resource
    private IMessageProvider messageProvider;

    @Test
    public void testSend() {
        Company company = new Company("一个测试公司名称");
        this.messageProvider.send(company); // 消息发送
    }
}