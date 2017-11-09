import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * User: ROOT
 * Date: 2017/11/9 23:37
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulGatewayApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ZuulGatewayApplication.class, args);
        new SpringApplicationBuilder(ZuulGatewayApplication.class).web(true).run(args);
    }

}
