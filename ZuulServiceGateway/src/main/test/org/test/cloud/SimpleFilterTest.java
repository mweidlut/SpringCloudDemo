package org.test.cloud;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: weimeng
 * Date: 2018/3/28 9:55
 */
public class SimpleFilterTest {

    private static Logger logger = LoggerFactory.getLogger(SimpleFilterTest.class);

    @Test
    public void test() throws Exception {

        for (int i=0; i<20000; i++){
            String methodGetResponse = HttpClientUtils.getMethodGetResponse("http://localhost:16666/api-a/person?firstname=anna&lastname=mike");

            logger.info("methodGetResponse=>{}", methodGetResponse);
        }
    }
}