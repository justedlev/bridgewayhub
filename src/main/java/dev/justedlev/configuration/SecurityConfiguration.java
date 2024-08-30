package dev.justedlev.configuration;

import dev.justedlev.component.KeycloakLogoutHandler;
import dev.justedlev.configuration.properties.SecurityProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
    private static final String LOGOUT = "/logout";

    private final KeycloakLogoutHandler keycloakLogoutHandler;
    private final SecurityProperties securityProperties;

    @Bean
    public SecurityWebFilterChain securityFilterChain(@NonNull ServerHttpSecurity httpSecurity) {
        return httpSecurity
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .oauth2Login(Customizer.withDefaults())
                .oauth2ResourceServer(spec -> spec.jwt(Customizer.withDefaults()))
                .logout(logoutHandler -> logoutHandler
                        .logoutUrl(LOGOUT)
                        .logoutHandler(keycloakLogoutHandler)
                        .logoutSuccessHandler(
                                (exchange, authentication) -> Mono.just(authentication)
                                        .doOnNext(s -> log.debug("{}", s))
                                        .then()
                        )
                )
                .authorizeExchange(spec -> spec
                        .pathMatchers(securityProperties.getWhiteListArray()).permitAll()
                        .anyExchange().authenticated()
                )
                .build();
    }
}
