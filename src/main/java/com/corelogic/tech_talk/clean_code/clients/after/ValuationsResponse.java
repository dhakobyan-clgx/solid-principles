package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.ValuationDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValuationsResponse extends GenericResponse<ValuationDetail> {

    public ValuationsResponse(List<Messages> messages, Integer totalRecords, List<ValuationDetail> clips) {
        super(messages, totalRecords, clips);
    }
}
