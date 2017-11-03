import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: ROOT
 * Date: 2017/11/1 21:50
 */
@ComponentScan("org.test.cloud")
@EnableEurekaServer
@SpringCloudApplication
public class EurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }


}

