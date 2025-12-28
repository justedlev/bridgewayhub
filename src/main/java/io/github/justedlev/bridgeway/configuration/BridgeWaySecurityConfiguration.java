package io.github.justedlev.bridgeway.configuration;

import io.github.justedlev.bridgeway.configuration.properties.BridgeWaySecurityConfigurationProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.oauth2.client.ConditionalOnOAuth2ClientRegistrationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.lang.NonNull;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Slf4j
@Configuration
@EnableConfigurationProperties(BridgeWaySecurityConfigurationProperties.class)
@ConditionalOnOAuth2ClientRegistrationProperties
@RequiredArgsConstructor
public class BridgeWaySecurityConfiguration {
    private final BridgeWaySecurityConfigurationProperties props;

    @Bean
    public SecurityWebFilterChain securityFilterChain(@NonNull ServerHttpSecurity httpSecurity,
                                                      ReactiveClientRegistrationRepository rcrr) {
        return httpSecurity
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .oauth2Login(Customizer.withDefaults())
                .oauth2ResourceServer(spec -> spec.jwt(Customizer.withDefaults()))
                .logout(spec -> spec
                        .logoutSuccessHandler(new OidcClientInitiatedServerLogoutSuccessHandler(rcrr))
                )
                .authorizeExchange(spec -> {
                    props.getWhitelist().forEach((k, v) -> spec.pathMatchers(k, v).permitAll());
                    spec.pathMatchers(HttpMethod.GET, "/actuator/prometheus")
                            .hasAuthority(props.getScopePrefix() + "prometheus.metrics:ro");
                    spec.anyExchange().authenticated();
                })
                .build();
    }
}
