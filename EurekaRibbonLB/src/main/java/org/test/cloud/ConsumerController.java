package org.test.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * User: ROOT
 * Date: 2017/11/4 10:16
 */

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT/person?fistname=steven&lastname=jobs", String.class)
                .getBody();
    }
}
