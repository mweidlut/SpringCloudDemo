import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: ROOT
 * Date: 2017/12/6 22:24
 */
@ComponentScan("org.test.cloud")
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);

        //http://localhost:7777/app-name/profile-name/branch-name
        //start then access   http://localhost:7777/config-server/prod/config-test
        //you will get the following message:
        //{"name":"config-server","profiles":["prod"],"label":"config-test","version":"fc318499bc3cdbf42fdd6f47342954766f3e73e5","state":null,"propertySources":[]}
    }
}
