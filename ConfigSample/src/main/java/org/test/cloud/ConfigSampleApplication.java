package org.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: ROOT
 * Date: 2017/12/6 22:24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSampleApplication.class, args);
    }
}
