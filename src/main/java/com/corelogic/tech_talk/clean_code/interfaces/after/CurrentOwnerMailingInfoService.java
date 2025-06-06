package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.CurrentOwnerMailingInfoResponseData;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;
import org.springframework.stereotype.Service;

@Service
public class CurrentOwnerMailingInfoService implements ExecutableBlockProductService, ClipRetrievalService<CurrentOwnerMailingInfoResponseData> {

    @Override
    public CurrentOwnerMailingInfoResponseData getByClip(String clip) throws  InterruptedException {
        return null;
    }

    @Override
    public void execute(String clip, Products response) throws  InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
