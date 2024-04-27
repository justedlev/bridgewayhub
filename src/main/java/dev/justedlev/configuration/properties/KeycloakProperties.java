package dev.justedlev.configuration.properties;

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
    private List<String> userGroups;
}
