package io.justedlev.msrv.bridgeway;

import io.justedlev.msrv.bridgeway.configuration.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@EnableDiscoveryClient
@EnableConfigurationProperties({
        SecurityProperties.class,
})
@SpringBootApplication
public class BridgeWayHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeWayHubApplication.class, args);
    }

}
