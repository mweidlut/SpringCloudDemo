package org.test.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: ROOT
 * Date: 2017/11/7 23:11
 */
@RestController
public class ConsumerController {

    @Autowired
    PersonFeignClient personClient;


    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String add() {
        return personClient.person("William", "Sun");
    }

}
