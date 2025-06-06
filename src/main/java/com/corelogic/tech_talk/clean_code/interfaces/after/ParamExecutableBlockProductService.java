package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public interface ParamExecutableBlockProductService extends BlockProductService {
    void executeWithParams(String clip, String params, Products response) throws  InterruptedException;
}
