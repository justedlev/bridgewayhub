package io.justedlev.msrv.bridgeway.component;

import io.justedlev.msrv.bridgeway.configuration.properties.KeycloakProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.logout.ServerLogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @deprecated {@link org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler} applied instead
 */
@Deprecated(forRemoval = true)
@Slf4j
@Component
@RequiredArgsConstructor
public class KeycloakLogoutHandler implements ServerLogoutHandler {
    private final WebClient webClient = WebClient.create();
    private final KeycloakProperties properties;

    @Override
    public Mono<Void> logout(WebFilterExchange exchange, Authentication authentication) {
        return Mono.just(authentication)
                .map(Authentication::getPrincipal)
                .cast(Jwt.class)
                .flatMap(jwt -> webClient.get()
                        .uri(properties.getLogoutUri())
                        .attribute("id_token_hint", jwt.getTokenValue())
                        .retrieve()
                        .bodyToMono(String.class))
                .then();
    }
}
