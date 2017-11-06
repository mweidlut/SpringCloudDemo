import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * User: ROOT
 * Date: 2017/11/1 21:50
 */
@ComponentScan("org.test.cloud")
@SpringCloudApplication
@EnableDiscoveryClient
public class EurekaRibbonLBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonLBApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}

