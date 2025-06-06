package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.LiensResponseData;
import org.springframework.stereotype.Service;

@Service
public class LienService implements BlockProductService, ClipRetrievalService<LiensResponseData> {

    @Override
    public LiensResponseData getByClip(String clip) throws  InterruptedException {
        return null;
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
