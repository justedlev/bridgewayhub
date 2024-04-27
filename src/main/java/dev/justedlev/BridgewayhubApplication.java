package dev.justedlev;

import dev.justedlev.configuration.properties.KeycloakClientProperties;
import dev.justedlev.configuration.properties.KeycloakProperties;
import dev.justedlev.configuration.properties.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@EnableDiscoveryClient
@EnableConfigurationProperties({
        KeycloakProperties.class,
        KeycloakClientProperties.class,
        SecurityProperties.class,
})
@SpringBootApplication
public class BridgewayhubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgewayhubApplication.class, args);
    }

}
