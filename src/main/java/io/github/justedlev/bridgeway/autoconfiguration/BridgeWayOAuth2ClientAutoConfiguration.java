package io.github.justedlev.bridgeway.autoconfiguration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.client.AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;

@AutoConfiguration
@ConditionalOnBooleanProperty(prefix = "spring.security.oauth2.client", name = "enabled", matchIfMissing = true)
@Import(ReactiveOAuth2ClientAutoConfiguration.class)
public class BridgeWayOAuth2ClientAutoConfiguration {
    @Getter
    @Setter(onMethod_ = @Value("${spring.security.oauth2.client.enabled:true}"))
    private boolean enabled;

    @Bean
    @ConditionalOnMissingBean
    ReactiveOAuth2AuthorizedClientManager authorizedClientServiceReactiveOAuth2AuthorizedClientManager(
            ReactiveClientRegistrationRepository clientRegistrationRepository,
            ReactiveOAuth2AuthorizedClientService authorizedClientService
    ) {
        return new AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager(
                clientRegistrationRepository, authorizedClientService);
    }

    @Bean
    ServerOAuth2AuthorizedClientExchangeFilterFunction exchangeFilterFunction(
            ReactiveOAuth2AuthorizedClientManager authorizedClientManager
    ) {
        var filter = new ServerOAuth2AuthorizedClientExchangeFilterFunction(authorizedClientManager);
        filter.setDefaultClientRegistrationId("client-credentials");
        filter.setDefaultOAuth2AuthorizedClient(true);

        return filter;
    }

    @Bean
    WebClientCustomizer webClientCustomizer(ServerOAuth2AuthorizedClientExchangeFilterFunction filter) {
        return builder -> builder.filter(filter);
    }

}
