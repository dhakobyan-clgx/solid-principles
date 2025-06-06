package com.corelogic.tech_talk.clean_code.service.helper;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MessageType {
    INFO("info"),
    WARN("warning"),
    ERROR("error");

    private final String type;

    private MessageType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return this.type;
    }
}
