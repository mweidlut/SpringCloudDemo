import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: ROOT
 * Date: 2017/11/6 22:03
 */
@ComponentScan("org.test.cloud")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaFeignLBApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaFeignLBApplication.class, args);
    }

}
