package com.corelogic.tech_talk.clean_code.vip.helper;

import lombok.Data;

import java.util.Map;

@Data
public class HTTPRequestData implements Cloneable{
    private String HTTPPostData;
    private String requestURI;
    private String requestHTTPVerb;
    private Map<String, String> HTTPHeaders;
    private RequestData requestData;
}
