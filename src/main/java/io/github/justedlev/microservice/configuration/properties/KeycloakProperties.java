package io.github.justedlev.microservice.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.net.URI;
import java.util.List;

@Setter
@Getter
@ConfigurationProperties(prefix = "keycloak")
public class KeycloakProperties {
    private URI serverUrl;
    private URI issuerUri;
    private URI jwkSetUri;
    private URI introspectionUri;
    private URI tokenUri;
    private String realm;
    @NestedConfigurationProperty
    private KeycloakClientProperties client;
    @NestedConfigurationProperty
    private KeycloakJwtConverterProperties jwtConverter;
    private List<String> userGroups;
}
