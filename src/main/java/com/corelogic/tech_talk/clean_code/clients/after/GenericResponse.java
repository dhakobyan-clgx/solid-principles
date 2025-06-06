package com.corelogic.tech_talk.clean_code.clients.after;


import com.corelogic.tech_talk.clean_code.clients.helper.Messages;
import lombok.Data;

import java.util.List;

@Data
public class GenericResponse<T> {

    private final List<Messages> messages;

    private final Integer totalRecords;

    private final List<T> clips;

    public GenericResponse(List<Messages> messages, Integer totalRecords, List<T> clips) {
        this.messages = messages;
        this.totalRecords = totalRecords;
        this.clips = clips;
    }

}