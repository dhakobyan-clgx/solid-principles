package com.corelogic.tech_talk.clean_code.service.after;

import com.corelogic.tech_talk.clean_code.service.helper.GraphQLServiceException;
import com.corelogic.tech_talk.clean_code.service.helper.MessageType;
import com.corelogic.tech_talk.clean_code.service.helper.ResponseMessage;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import com.netflix.graphql.dgs.client.CustomGraphQLClient;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import java.util.Collections;

@Service
public class SdpGraphQLService {

    private static final Logger logger = LoggerFactory.getLogger(SdpGraphQLService.class);
    private final CustomGraphQLClient graphQLClient;
    private final CustomGraphQLClient graphQLClientInt;

    public SdpGraphQLService(@Qualifier("defaultGraphQLClient") CustomGraphQLClient graphQLClient,
                             @Qualifier("intGraphQLClient") CustomGraphQLClient graphQLClientInt) {
        this.graphQLClient = graphQLClient;
        this.graphQLClientInt = graphQLClientInt;
    }

    public GraphQLResponse executeGraphQLService(GraphQLQueryRequest graphQLQueryRequest) throws Exception {
        return this.executeGraphQLService(graphQLQueryRequest, false);
    }

    public GraphQLResponse executeGraphQLService(GraphQLQueryRequest graphQLQueryRequest, boolean pointToInt) throws Exception {
        try {
            String query = graphQLQueryRequest.serialize();
            logger.debug("Query: {}", query);
            if (pointToInt) {
                return graphQLClientInt.executeQuery(query);
            }
            return graphQLClient.executeQuery(query);
        } catch (Exception e) {
            if (e instanceof HttpClientErrorException httpClientErrorException) {
                String errorMessage = httpClientErrorException.getStatusText();
                int statusCode = httpClientErrorException.getStatusCode().value();
                ResponseMessage responseMessage = new ResponseMessage();
                if (StringUtils.hasLength(errorMessage)) {
                    responseMessage.setMessage(errorMessage);
                } else {
                    responseMessage.setMessage(HttpStatus.valueOf(statusCode).getReasonPhrase());
                }

                responseMessage.setMessageType(MessageType.ERROR);
                throw new GraphQLServiceException(statusCode, Collections.singletonList(responseMessage));
            }
            throw new Exception("An exception has occurred while processing vendor response ", e);
        }
    }
}
