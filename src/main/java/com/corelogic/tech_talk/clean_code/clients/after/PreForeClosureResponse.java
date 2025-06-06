package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.PreForeClosureDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class PreForeClosureResponse extends GenericResponse<PreForeClosureDetail> {

    public PreForeClosureResponse(List<Messages> messages, Integer totalRecords, List<PreForeClosureDetail> clips) {
        super(messages, totalRecords, clips);
    }

}
