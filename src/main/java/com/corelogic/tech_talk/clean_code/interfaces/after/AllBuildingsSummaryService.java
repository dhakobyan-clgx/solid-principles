package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.AllBuildingsSummaryResponseData;
import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public class AllBuildingsSummaryService implements ExecutableBlockProductService, ClipRetrievalService<AllBuildingsSummaryResponseData> {

    @Override
    public AllBuildingsSummaryResponseData getByClip(String clip) throws InterruptedException {
        return null;
    }

    @Override
    public void execute(String clip, Products response) throws InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
