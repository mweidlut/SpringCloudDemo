import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * User: ROOT
 * Date: 2017/11/4 0:10
 */
@ComponentScan("org.test.cloud")
@EnableDiscoveryClient
@PropertySource(value = "classpath:/*.yml", ignoreResourceNotFound = true)
@SpringCloudApplication
public class EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
}
