package org.test.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Stream消费者
 * User: weimeng
 * Date: 2018/9/12 15:30
 */
@SpringCloudApplication
public class StreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }

}
