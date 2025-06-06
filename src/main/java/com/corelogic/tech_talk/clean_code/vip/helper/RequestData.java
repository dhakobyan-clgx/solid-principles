package com.corelogic.tech_talk.clean_code.vip.helper;

import lombok.Data;

@Data
public class RequestData {
    private String partner;
    private String service;
    private String action;
    private String postbackURI;
    private String APIKey;
    private String payload;
    private HttpHeaderFields httpHeaderFields;
    private boolean dirty;
    private Integer index = 0;

    public RequestData() {
        // default constructor
        this.dirty = false;
    }
    // ...
}
