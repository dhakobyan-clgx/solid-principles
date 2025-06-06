package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.BuildingPermits;
import org.springframework.stereotype.Service;

@Service
public class BuildingPermitsProductService implements BlockProductService, ClipRetrievalService<BuildingPermits> {
    @Override
    public BuildingPermits getByClip(String clip) throws InterruptedException {
        return null;
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}