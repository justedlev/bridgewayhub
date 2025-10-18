package io.github.justedlev.bridgeway.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpMethod;

import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(BridgeWaySecurityConfigurationProperties.PREFIX)
public class BridgeWaySecurityConfigurationProperties {
    public static final String PREFIX = "bridgeway.security";
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String SCOPE_PREFIX = "SCOPE_";
    /**
     * A map that holds the HTTP method as the key and an array of allowed endpoint patterns as the value.
     * <p>
     * For example:
     *
     * <pre class="code">
     * whitelist:
     *   GET: ["/public", "/api/health"]
     *   POST: ["/api/login"]
     * </pre>
     *
     * @see HttpMethod
     */
    private Map<HttpMethod, String[]> whitelist = Map.of();
    private String rolePrefix = ROLE_PREFIX;
    private String scopePrefix = SCOPE_PREFIX;
}
