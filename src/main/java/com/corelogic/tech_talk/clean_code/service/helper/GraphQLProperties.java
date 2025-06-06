package com.corelogic.tech_talk.clean_code.service.helper;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("graphql")
public class GraphQLProperties {
    private String key;
    private String url;
    private String intKey;
    private String intUrl;
}
