package pas.cloud.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplesCfDemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ApplesCfDemoApplication.class, args);
    }
}
