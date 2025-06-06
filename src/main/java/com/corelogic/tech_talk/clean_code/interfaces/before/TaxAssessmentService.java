package com.corelogic.tech_talk.clean_code.interfaces.before;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;
import com.corelogic.tech_talk.clean_code.interfaces.helper.TaxAssessment;

public class TaxAssessmentService implements BlockProductService {
    @Override
    public TaxAssessment getByClip(String clip) throws InterruptedException {
        throw new IllegalArgumentException("Unsupported invocation for clip " + clip);
    }

    public void executeWithParams(String clip, String params, Products response) throws InterruptedException {
        // implementation
    }

    public void execute(String clip, Products response) throws InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return BlockProductEnum.TAX_ASSESSMENTS_LATEST;
    }

}
