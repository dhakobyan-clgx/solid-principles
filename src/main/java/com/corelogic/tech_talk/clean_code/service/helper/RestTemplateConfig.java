package com.corelogic.tech_talk.clean_code.service.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestTemplateConfig {

    @Value("${rest.template.connect.timeout:10000}")
    private int restTemplateConnectTimeout;

    @Value("${rest.template.read.timeout:120000}")
    private int restTemplateReadTimeout;

    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(restTemplateConnectTimeout);
        factory.setReadTimeout(restTemplateReadTimeout);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(factory);
        return restTemplate;
    }
}
