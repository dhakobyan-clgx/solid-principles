package com.corelogic.tech_talk.clean_code.service.helper;

import java.io.Serializable;

public class ResponseMessage implements Serializable {
    private MessageType messageType;
    private String message;

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
