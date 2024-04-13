package io.github.justedlev.microservice;

import io.github.justedlev.microservice.configuration.properties.KeycloakClientProperties;
import io.github.justedlev.microservice.configuration.properties.KeycloakJwtConverterProperties;
import io.github.justedlev.microservice.configuration.properties.KeycloakProperties;
import io.github.justedlev.microservice.configuration.properties.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties({
        KeycloakProperties.class,
        KeycloakClientProperties.class,
        KeycloakJwtConverterProperties.class,
        SecurityProperties.class,
})
public class BridgewayhubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgewayhubApplication.class, args);
    }

}
