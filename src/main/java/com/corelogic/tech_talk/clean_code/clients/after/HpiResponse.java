package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.HpiData;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class HpiResponse extends GenericResponse<HpiData> {

    public HpiResponse(List<Messages> messages, Integer totalRecords, List<HpiData> clips) {
        super(messages, totalRecords, clips);
    }

}
