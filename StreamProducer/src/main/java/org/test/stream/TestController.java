package org.test.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用
 * User: weimeng
 * Date: 2018/9/12 17:02
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private IMessageProvider messageProvider;

    @PostMapping("/company/{name}")
    public void test(@PathVariable String name){

        logger.info("发送公司名称：{}", name);

        Company company = new Company(name);
        messageProvider.send(company);

        logger.info("发送消息完毕。");
    }
}
