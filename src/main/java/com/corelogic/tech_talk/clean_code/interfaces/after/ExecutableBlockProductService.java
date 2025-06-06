package com.corelogic.tech_talk.clean_code.interfaces.after;

import com.corelogic.tech_talk.clean_code.interfaces.helper.Products;

public interface ExecutableBlockProductService extends BlockProductService {
    void execute(String clip, Products response) throws InterruptedException;
}