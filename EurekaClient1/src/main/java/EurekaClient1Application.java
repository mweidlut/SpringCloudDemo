import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@SpringBootApplication
public class EurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1Application.class, args);
    }
}
