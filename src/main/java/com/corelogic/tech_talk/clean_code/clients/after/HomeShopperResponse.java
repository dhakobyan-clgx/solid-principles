package com.corelogic.tech_talk.clean_code.clients.after;

import com.corelogic.tech_talk.clean_code.clients.helper.HomeShopperDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;

import java.util.List;

public class HomeShopperResponse extends GenericResponse<HomeShopperDetail> {

    public HomeShopperResponse(List<Messages> messages, Integer totalRecords, List<HomeShopperDetail> clips) {
        super(messages, totalRecords, clips);
    }
}

