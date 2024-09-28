package io.justedlev.msrv.bridgeway.configuration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Slf4j
@Configuration
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
    private final SecurityProperties properties;

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
                    properties.getWhitelist().forEach((k, v) -> spec.pathMatchers(k, v).permitAll());
                    spec.anyExchange().authenticated();
                })
                .build();
    }
}
