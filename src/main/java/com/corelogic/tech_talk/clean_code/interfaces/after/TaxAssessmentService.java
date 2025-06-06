package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public class TaxAssessmentService implements ParamExecutableBlockProductService {
    @Override
    public void executeWithParams(String clip, String params, Products response) throws InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
