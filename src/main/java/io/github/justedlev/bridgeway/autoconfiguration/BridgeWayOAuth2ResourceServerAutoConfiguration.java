package io.github.justedlev.bridgeway.autoconfiguration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.security.oauth2.resource.reactive.ReactiveOAuth2ResourceServerAutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@ConditionalOnBooleanProperty(prefix = "spring.security.oauth2.resourceserver", name = "enabled", matchIfMissing = true)
@Import(ReactiveOAuth2ResourceServerAutoConfiguration.class)
public class BridgeWayOAuth2ResourceServerAutoConfiguration {
    @Getter
    @Setter(onMethod_ = @Value("${spring.security.oauth2.resourceserver.enabled:true}"))
    private boolean enabled;
}
