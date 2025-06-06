package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class HpiForecastResponse extends GenericResponse<HpiForecastData> {

    public HpiForecastResponse(List<Messages> messages, Integer totalRecords, List<HpiForecastData> clips) {
        super(messages, totalRecords, clips);
    }
}
