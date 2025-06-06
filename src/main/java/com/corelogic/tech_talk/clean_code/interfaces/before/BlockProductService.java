package com.corelogic.tech_talk.clean_code.interfaces.before;

import com.corelogic.tech_talk.clean_code.interfaces.helper.BlockProductEnum;
import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public interface BlockProductService {

    Object getByClip(String clip) throws InterruptedException;

    String template = "Unsupported invocation for clip %s";

    default void execute(String clip, Products response) throws InterruptedException {
        throw new IllegalArgumentException(String.format(template, clip));
    }

    default void executeWithParams(String clip, String params, Products response) throws InterruptedException {
        throw new IllegalArgumentException(String.format(template, clip));
    }

    BlockProductEnum getBlockProductType();
}
