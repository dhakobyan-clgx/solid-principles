package com.corelogic.tech_talk.clean_code.service.before;

import com.corelogic.tech_talk.clean_code.service.helper.GraphQLServiceException;
import com.corelogic.tech_talk.clean_code.service.helper.MessageType;
import com.corelogic.tech_talk.clean_code.service.helper.ResponseMessage;
import com.corelogic.tech_talk.clean_code.service.helper.RestTemplateConfig;
import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import com.netflix.graphql.dgs.client.HttpResponse;

import java.util.Collections;
import java.util.List;


@Service
@AllArgsConstructor
public class SdpGraphQLService {
    private static final Logger logger = LoggerFactory.getLogger(SdpGraphQLService.class);
    private static final String APIKEY_HEADER = "x-api-key";
    private RestTemplateConfig restTemplateConfig;

    public GraphQLResponse executeGraphQLService(GraphQLQueryRequest graphQLQueryRequest, String apiKey, String graphQLUrl) throws Exception {
        try {
            CustomGraphQLClient graphQLClient = GraphQLClient.createCustom(graphQLUrl, (url, headers, body) -> {
                List<MediaType> accept =
                        Collections.singletonList(MediaType.APPLICATION_JSON);
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.add(APIKEY_HEADER, apiKey);
                httpHeaders.setAccept(accept);
                headers.forEach(httpHeaders::addAll);
                ResponseEntity<String> exchange = restTemplateConfig.restTemplate().exchange(graphQLUrl, HttpMethod.POST, new HttpEntity<>(body, httpHeaders), String.class);
                return new HttpResponse(exchange.getStatusCode().value(), exchange.getBody());
            });
            String query = graphQLQueryRequest.serialize();
            logger.info("Query: {}", query);
            GraphQLResponse response = graphQLClient.executeQuery(query);
            return response;
        } catch (Exception e) {
            if (e instanceof HttpClientErrorException) {
                String errorMessage = ((HttpClientErrorException) e).getStatusText();
                int statusCode = ((HttpClientErrorException) e).getRawStatusCode();
                ResponseMessage responseMessage = new ResponseMessage();
                if (StringUtils.isEmpty(errorMessage)) {
                    responseMessage.setMessage(HttpStatus.valueOf(statusCode).getReasonPhrase());
                } else {
                    responseMessage.setMessage(errorMessage);
                }

                responseMessage.setMessageType(MessageType.ERROR);
                throw new GraphQLServiceException(statusCode, Collections.singletonList(responseMessage));
            }
            throw new Exception("An exception has occurred while processing vendor response ", e);
        }
    }

}
