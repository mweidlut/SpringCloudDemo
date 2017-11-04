package org.test.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.NotNull;

/**
 * User: ROOT
 * Date: 2017/11/4 10:16
 */

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String person(@NotNull @RequestParam String firstname,
                         @NotNull @RequestParam String lastname) {

        String requestUrl = "http://EUREKA-CLIENT/person?firstname=%s&lastname=%s";
        String urlWithParam = String.format(requestUrl, firstname, lastname);

        return restTemplate.getForEntity(urlWithParam, String.class)
                .getBody();
    }
}
