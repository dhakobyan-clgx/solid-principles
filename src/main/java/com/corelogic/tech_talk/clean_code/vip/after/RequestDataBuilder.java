package com.corelogic.tech_talk.clean_code.vip.after;

import com.corelogic.tech_talk.clean_code.vip.helper.HTTPRequestData;
import com.corelogic.tech_talk.clean_code.vip.helper.RequestData;
import com.corelogic.tech_talk.clean_code.vip.helper.RequestDataException;
import org.springframework.http.MediaType;

import java.util.List;

import static com.corelogic.tech_talk.clean_code.vip.helper.RequestDataBuilderConstants.*;

public class RequestDataBuilder {
    private final EPCMercuryService epcMercuryService;

    public RequestDataBuilder(EPCMercuryService epcMercuryService) {
        this.epcMercuryService = epcMercuryService;
    }

    public RequestData getRequestData(HTTPRequestData httpRequestData) throws RequestDataException {
        RequestData requestData = new RequestData();
        // code before this point is not relevant to the example

        if (isSimulateAiqHubError(httpRequestData)) {
            return getSimulateAiqHubError(httpRequestData);
        }

        if (isSimulateAiqHubCipNack(httpRequestData)) {
            return getSimulateAiqHubCipNack(httpRequestData);
        }


        if (httpRequestData.getHTTPPostData().contains("EPCMercury_Response")) {
            requestData.setPartner("MERCURY_NETWORK");
            requestData.setService("MERCURYAPPRAISALELLIEMAEPC2JSON");
            if (epcMercuryService.containsTag(httpRequestData.getHTTPPostData())) {
                requestData.setAction(epcMercuryService.getAction(httpRequestData.getHTTPPostData()));
            }
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", MediaType.APPLICATION_JSON_VALUE);
            return requestData;
        }
        // code after this point is not relevant to the example
        // ...
        return requestData;
    }


    private RequestData getSimulateAiqHubError(HTTPRequestData httpRequestData) {
        RequestData requestData = new RequestData();
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_500) || httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_500)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_500 + "-NoBody") ||
                httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_500 + "-NoBody")) {
                requestData.setAction("Original");
                requestData.setPayload("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                                       "<AutomatiqHubNack500NoBody></AutomatiqHubNack500NoBody>");
            } else if (httpRequestData.getHTTPPostData().contains("AUTOMATIQ_HUB_REQUEST_MULTIERROR")) {
                requestData.setAction("Nack_MultiError");
            } else {
                httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
                requestData.setPayload("");
                httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
                requestData.setAction("500NackWithBody");
            }
            return requestData;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_MINUS_998) || httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_MINUS_998)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Minus-998");
            return requestData;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_ERROR_998) || httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_ERROR_998)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Error-998");
            return requestData;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_MINUS_999) || httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_MINUS_999)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Minus-999");
            return requestData;
        }
        return requestData;
    }

    private boolean isSimulateAiqHubError(HTTPRequestData httpRequestData) {
        List<String> errorCodes = List.of(AUTOMATIQ_HUB_500, AUTOMATIQ_HUB_MINUS_998, AUTOMATIQ_HUB_ERROR_998, AUTOMATIQ_HUB_MINUS_999);
        return errorCodes.stream().anyMatch(code ->
                httpRequestData.getRequestURI().contains(code) || httpRequestData.getHTTPPostData().contains(code)
        );
    }

    private boolean isSimulateAiqHubCipNack(HTTPRequestData httpRequestData) {
        List<String> errorCodes = List.of("AIQHUB-CIP-NACK-1012-VOEI", "AIQHUB-CIP-NACK-1012-LA",
                "AIQHUB-CIP-NACK-1012-TAP", "AIQHUB-CIP-NACK-1012-SSA89"
        );

        String postData = httpRequestData.getHTTPPostData();
        return postData.contains("AIQHUB-CIP-NACK") && postData.contains("embeddedFiles") &&
               (postData.contains("objectURL") || postData.contains("embeddedFileContent")) &&
               errorCodes.stream().anyMatch(postData::contains);
    }

    private RequestData getSimulateAiqHubCipNack(HTTPRequestData httpRequestData) {
        RequestData requestData = new RequestData();
        requestData.setPartner("AUTOMATIQ");
        requestData.setPostbackURI("");
        requestData.setAPIKey("");
        requestData.setPayload("");
        String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>";
        httpRequestData.setHTTPPostData(xmlStr);
        httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");

        String postData = httpRequestData.getHTTPPostData();
        if (postData.contains("AIQHUB-CIP-NACK-1012-VOEI")) {
            return buildRequestData(requestData, "AUTOMATIQ_HUB_VOE", "CIP-NACK-1012");
        }
        if (postData.contains("AIQHUB-CIP-NACK-1012-LA")) {
            return buildRequestData(requestData, "AUTOMATIQ_HUB_LA", "CIP-NACK-1012");
        }
        if (postData.contains("AIQHUB-CIP-NACK-1012-TAP")) {
            return buildRequestData(requestData, "AUTOMATIQ_HUB_TAX_AND_PAYROLL", "CIP-NACK-1012");
        }
        if (postData.contains("AIQHUB-CIP-NACK-1012-SSA89")) {
            return buildRequestData(requestData, "AUTOMATIQ_HUB_SSA89", "CIP-NACK-1012");
        }
        return requestData;
    }

    private RequestData buildRequestData(RequestData requestData, String service, String action) {
        requestData.setService(service);
        requestData.setAction(action);
        return requestData;
    }

}
