package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.VoluntaryLienDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class VoluntaryLienResponse extends GenericResponse<VoluntaryLienDetail> {

    public VoluntaryLienResponse(List<Messages> messages, Integer totalRecords, List<VoluntaryLienDetail> clips) {
        super(messages, totalRecords, clips);
    }

}
