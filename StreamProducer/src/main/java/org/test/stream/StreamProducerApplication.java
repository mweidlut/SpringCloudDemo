package org.test.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Stream生产者
 * User: weimeng
 * Date: 2018/9/12 15:34
 */
@PropertySource(value = "classpath:/*.yml", ignoreResourceNotFound = true)
@SpringCloudApplication
public class StreamProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamProducerApplication.class, args);
    }
}
