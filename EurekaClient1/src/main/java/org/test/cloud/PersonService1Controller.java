package org.test.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ROOT
 * Date: 2017/11/4 0:13
 */
@RestController
public class PersonService1Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person(@RequestParam String firstname, @RequestParam String lastname){
        ServiceInstance instance = client.getLocalServiceInstance();
        String  r = "Hello " + lastname + " " + firstname + "!";

        logger.info("/person, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);

        return "From Person Service, Result is " + r;
    }

}
