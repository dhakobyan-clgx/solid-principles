package com.corelogic.tech_talk.clean_code.interfaces.before;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;
import org.springframework.stereotype.Service;

@Service
public class AllBuildingsSummaryService implements BlockProductService {

    @Override
    public Object getByClip(String clip) throws  InterruptedException {
        return null;
    }

    public void execute(String clip, Products response) throws  InterruptedException {
        // implementation
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
