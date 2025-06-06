package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.PropertyStructureDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class PropertyStructureResponse extends GenericResponse<PropertyStructureDetail> {

    public PropertyStructureResponse(List<Messages> messages, Integer totalRecords, List<PropertyStructureDetail> clips) {
        super(messages, totalRecords, clips);
    }

}
