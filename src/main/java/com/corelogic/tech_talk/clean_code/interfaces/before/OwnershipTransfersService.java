package com.corelogic.tech_talk.clean_code.interfaces.before;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public class OwnershipTransfersService implements BlockProductService {
    @Override
    public Object getByClip(String clip) throws InterruptedException {
        throw new IllegalArgumentException("Unsupported invocation for clip " + clip);
    }

    public void executeWithParams(String clip, String params, Products response) throws InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
