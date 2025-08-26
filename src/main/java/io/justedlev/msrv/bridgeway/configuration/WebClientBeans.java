package io.justedlev.msrv.bridgeway.configuration;

import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;

@Configuration
public class WebClientBeans {
    @Bean
    ServerOAuth2AuthorizedClientExchangeFilterFunction exchangeFilterFunction(
            ReactiveOAuth2AuthorizedClientManager authorizedClientManager,
            Environment environment
    ) {
        var clientRegistrationId = environment.getProperty("spring.application.name", "main");
        var filter = new ServerOAuth2AuthorizedClientExchangeFilterFunction(authorizedClientManager);
        filter.setDefaultClientRegistrationId(clientRegistrationId);
        filter.setDefaultOAuth2AuthorizedClient(true);

        return filter;
    }

    @Bean
    WebClientCustomizer webClientCustomizer(ServerOAuth2AuthorizedClientExchangeFilterFunction filter) {
        return builder -> builder.filter(filter);
    }
}
