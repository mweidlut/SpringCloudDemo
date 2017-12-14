import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: ROOT
 * Date: 2017/12/6 22:24
 */
@ComponentScan("org.test.cloud")
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSampleApplication.class, args);
    }
}
