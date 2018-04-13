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
import org.springframework.web.client.RestTemplate;

/**
 * User: ROOT
 * Date: 2017/11/4 0:13
 */
@RestController
public class PersonService3Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person(@RequestParam String firstname, @RequestParam String lastname){
        ServiceInstance instance = client.getLocalServiceInstance();
        String  r = "Hello " + lastname + " " + firstname + "!";

        logger.info("/person, host:{}, service_id:{}, result:{}", instance.getHost(), instance.getServiceId(), r);

        this.callOtherServiceByServiceId(firstname, lastname);

        return "From Person Service-3, Result is " + r;
    }

    private void callOtherServiceByServiceId(String firstname, String lastname){

        String requestUrl = "http://EUREKA-CLIENT/person?firstname=%s&lastname=%s";
        String urlWithParam = String.format(requestUrl, firstname, lastname);

        String result =  restTemplate.getForEntity(urlWithParam, String.class)
                .getBody();

        logger.info("Service-3 calling...EUREKA-CLIENT....and result = {}", result);
    }

}
