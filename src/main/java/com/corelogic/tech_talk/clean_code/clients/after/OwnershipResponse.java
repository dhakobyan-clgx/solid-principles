package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.PropertyOwnershipDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class OwnershipResponse extends GenericResponse<PropertyOwnershipDetail> {

    public OwnershipResponse(List<Messages> messages, Integer totalRecords, List<PropertyOwnershipDetail> clips) {
        super(messages, totalRecords, clips);
    }

}
