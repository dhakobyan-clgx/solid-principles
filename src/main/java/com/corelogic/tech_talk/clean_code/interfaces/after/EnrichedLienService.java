package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.EnrichedLiensRiskResponseData;
import org.springframework.stereotype.Service;

@Service
public class EnrichedLienService implements BlockProductService, ClipRetrievalService<EnrichedLiensRiskResponseData> {

    @Override
    public EnrichedLiensRiskResponseData getByClip(String clip) throws  InterruptedException {
        return null;
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
