package org.test.cloud;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: ROOT
 * Date: 2017/11/9 23:22
 */
@Component
public class PersonClientHystrix implements PersonFeignClient{

    @Override
    public String person(@RequestParam(value = "firstname") String firstname,
                         @RequestParam(value = "lastname") String lastname) {
        return "Feign error, can not find "+firstname+" "+lastname;
    }
}
