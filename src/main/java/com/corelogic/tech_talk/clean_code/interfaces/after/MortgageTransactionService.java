package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.MortgageTransactionProduct;
import org.springframework.stereotype.Service;

@Service
public class MortgageTransactionService implements BlockProductService, ClipRetrievalService<MortgageTransactionProduct> {

    @Override
    public MortgageTransactionProduct getByClip(String clip) throws InterruptedException {
        return null;
    }

    @Override
    public BlockProductEnum getBlockProductType() {
        return null;
    }
}
