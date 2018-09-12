package org.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * User: ROOT
 * Date: 2017/11/1 21:50
 */
@ComponentScan("org.test.cloud")
@EnableEurekaServer
@PropertySource(value = "classpath:/*.yml", ignoreResourceNotFound = true)
@SpringCloudApplication
public class EurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1Application.class, args);
    }


}

