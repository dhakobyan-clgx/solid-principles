package com.corelogic.tech_talk.clean_code.clients.helper;


import com.corelogic.tech_talk.clean_code.clients.after.GenericResponse;
import com.corelogic.tech_talk.clean_code.clients.after.HpiForecastData;

import java.util.List;

public class HpiForecastResponse extends GenericResponse<HpiForecastData> {

    public HpiForecastResponse(List<Messages> messages, Integer totalRecords, List<HpiForecastData> clips) {
        super(messages, totalRecords, clips);
    }

}
