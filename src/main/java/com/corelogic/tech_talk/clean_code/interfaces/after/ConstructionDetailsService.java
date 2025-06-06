package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.ConstructionDetailsResponseData;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;
import org.springframework.stereotype.Service;

@Service
public class ConstructionDetailsService implements ExecutableBlockProductService, ClipRetrievalService<ConstructionDetailsResponseData> {

    @Override
    public ConstructionDetailsResponseData getByClip(String clip) throws InterruptedException {
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
