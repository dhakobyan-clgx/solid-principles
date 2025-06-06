package com.corelogic.tech_talk.clean_code.service.helper;

import java.util.List;

public class GraphQLServiceException extends RuntimeException {
    private final int status;
    private final List<ResponseMessage> messages;

    public GraphQLServiceException(int status, List<ResponseMessage> messages) {
        this.messages = messages;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public List<ResponseMessage> getMessages() {
        return messages;
    }
}

