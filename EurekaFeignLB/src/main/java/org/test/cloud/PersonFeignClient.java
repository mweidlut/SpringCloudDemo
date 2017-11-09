package org.test.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: ROOT
 * Date: 2017/11/6 22:07
 */
@FeignClient(value = "eureka-client", fallback = PersonClientHystrix.class)
public interface PersonFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/person")
    String person(@RequestParam(value = "firstname") String firstname,
                  @RequestParam(value = "lastname") String lastname);

}
