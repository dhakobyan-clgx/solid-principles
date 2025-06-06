package com.corelogic.tech_talk.clean_code.interfaces.after;

public interface ClipRetrievalService<T> extends BlockProductService {
    T getByClip(String clip) throws InterruptedException;
}
