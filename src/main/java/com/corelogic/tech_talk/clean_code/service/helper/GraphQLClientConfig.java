package com.corelogic.tech_talk.clean_code.service.helper;

import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.HttpResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@Configuration
public class GraphQLClientConfig {

    private static final String APIKEY_HEADER = "x-api-key";
    private final RestTemplate restTemplate;

    public GraphQLClientConfig(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Bean
    @Qualifier("defaultGraphQLClient")
    public CustomGraphQLClient graphQLClient(GraphQLProperties graphQLProperties) {
        return createCustomGraphQLClient(graphQLProperties.getUrl(), graphQLProperties.getKey());
    }

    @Bean
    @Qualifier("intGraphQLClient")
    public CustomGraphQLClient graphQLClientInt(GraphQLProperties graphQLProperties) {
        return createCustomGraphQLClient(graphQLProperties.getIntUrl(), graphQLProperties.getIntKey());
    }

    @NotNull
    protected CustomGraphQLClient createCustomGraphQLClient(String url, String key) {
        return GraphQLClient.createCustom(url, (_url, headers, body) -> {
            List<MediaType> accept = singletonList(APPLICATION_JSON);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(APIKEY_HEADER, key);
            httpHeaders.setAccept(accept);
            headers.forEach(httpHeaders::addAll);
            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(body, httpHeaders), String.class);
            return new HttpResponse(exchange.getStatusCode().value(), exchange.getBody());
        });
    }
}
