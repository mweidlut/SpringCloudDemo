package org.test.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ROOT
 * Date: 2017/12/6 23:39
 */
@RefreshScope
@RestController
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/from", method = RequestMethod.GET)
    public String from() {
        logger.info("from git rep, from={}", from);
        return this.from;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
