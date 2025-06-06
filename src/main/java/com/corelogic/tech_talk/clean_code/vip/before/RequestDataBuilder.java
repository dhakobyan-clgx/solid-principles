package com.corelogic.tech_talk.clean_code.vip.before;

import com.corelogic.tech_talk.clean_code.vip.helper.HTTPRequestData;
import com.corelogic.tech_talk.clean_code.vip.helper.RequestData;
import com.corelogic.tech_talk.clean_code.vip.helper.RequestDataException;

import static com.corelogic.tech_talk.clean_code.vip.helper.RequestDataBuilderConstants.*;

public class RequestDataBuilder {
    public RequestData getRequestData(HTTPRequestData httpRequestData) throws RequestDataException {
        RequestData requestData = new RequestData();

        // ....
        // code before this point is not relevant to the example

        if (isSimulateAiqHubError(httpRequestData, requestData)) {
            return requestData;
        }

        if (isSimulateAiqHubCipNack(httpRequestData, requestData)) {
            return requestData;
        }

        if (httpRequestData.getHTTPPostData().contains("EPCMercury_Response")) {
            requestData.setPartner("MERCURY_NETWORK");
            requestData.setService("MERCURYAPPRAISALELLIEMAEPC2JSON");
            if (httpRequestData.getHTTPPostData().contains("_AddDocument") ||
                httpRequestData.getHTTPPostData().contains("_UpdatePayment") ||
                httpRequestData.getHTTPPostData().contains("_EmailNotification") ||
                httpRequestData.getHTTPPostData().contains("_Comment") ||
                httpRequestData.getHTTPPostData().contains("_CommentWithAction") ||
                httpRequestData.getHTTPPostData().contains("_Cancellation") ||
                httpRequestData.getHTTPPostData().contains("_Delayed") ||
                httpRequestData.getHTTPPostData().contains("_OnHold") ||
                httpRequestData.getHTTPPostData().contains("_OffHold") ||
                httpRequestData.getHTTPPostData().contains("_Correction") ||
                httpRequestData.getHTTPPostData().contains("_CorrectionCancelled") ||
                httpRequestData.getHTTPPostData().contains("_RevisionNeeded") ||
                httpRequestData.getHTTPPostData().contains("_RequestRevision-ROV") ||
                httpRequestData.getHTTPPostData().contains("_CancelRevision-ROV")) {
                requestData.setAction("AddDocumentResponse");
            } else if (httpRequestData.getHTTPPostData().contains("_NACKAddDocument")) {
                requestData.setAction("AddDocumentResponseNack");
            } else if (httpRequestData.getHTTPPostData().contains("_NACKUpdatePayment") ||
                       httpRequestData.getHTTPPostData().contains("_NACKCancellation") ||
                       httpRequestData.getHTTPPostData().contains("_NACKDelayed") ||
                       httpRequestData.getHTTPPostData().contains("_NACKOnHold") ||
                       httpRequestData.getHTTPPostData().contains("_NACKOffHold") ||
                       httpRequestData.getHTTPPostData().contains("_NACKCorrectionCancelled") ||
                       httpRequestData.getHTTPPostData().contains("_NACKCorrection") ||
                       httpRequestData.getHTTPPostData().contains("_NACKRequestRevision-ROV") ||
                       httpRequestData.getHTTPPostData().contains("_NACKRevisionNeeded") ||
                       httpRequestData.getHTTPPostData().contains("_NACKCancelRevision-ROV")) {
                requestData.setAction("UpdatePaymentResponseNack");
            } else if (httpRequestData.getHTTPPostData().contains("_NACKComment") ||
                       httpRequestData.getHTTPPostData().contains("_NACKCommentWithAction")) {
                requestData.setAction("UpdatePaymentResponseNack");
            } else if (httpRequestData.getHTTPPostData().contains("_Update")) {
                requestData.setAction("UpdateResponse");
            }
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "application/json");
            return requestData;
        }

        return requestData;
    }


    private boolean isSimulateAiqHubError(HTTPRequestData httpRequestData, RequestData requestData) {
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_500) ||
            httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_500)) {
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
            return true;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_MINUS_998) ||
            httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_MINUS_998)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Minus-998");
            return true;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_ERROR_998) ||
            httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_ERROR_998)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Error-998");
            return true;
        }
        if (httpRequestData.getRequestURI().contains(AUTOMATIQ_HUB_MINUS_999) ||
            httpRequestData.getHTTPPostData().contains(AUTOMATIQ_HUB_MINUS_999)) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setService("AUTOMATIQ_HUB");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            httpRequestData.setHTTPPostData("<?xml version=\"1.0\" encoding=\"UTF-8\"?><AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>");
            requestData.setAction("NACK-Minus-999");
            return true;
        }
        return false;
    }

    private boolean isSimulateAiqHubCipNack(HTTPRequestData httpRequestData, RequestData requestData) {
        if (httpRequestData.getHTTPPostData().contains("AIQHUB-CIP-NACK") && httpRequestData.getHTTPPostData().contains("embeddedFiles") &&
            ((httpRequestData.getHTTPPostData().contains("objectURL")) || httpRequestData.getHTTPPostData().contains("embeddedFileContent"))) {
            requestData.setPartner("AUTOMATIQ");
            requestData.setPostbackURI("");
            requestData.setAPIKey("");
            String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                            "<AutomatiqHub><Request>AutomatiqHubRequest</Request></AutomatiqHub>";
            httpRequestData.getHTTPHeaders().put("CONTENT-TYPE", "text/xml");
            requestData.setPayload("");
            if (httpRequestData.getHTTPPostData().contains("AIQHUB-CIP-NACK-1012-VOEI")) {
                httpRequestData.setHTTPPostData(xmlStr);
                requestData.setService("AUTOMATIQ_HUB_VOE");
                requestData.setAction("CIP-NACK-1012");
                return true;
            }
            if (httpRequestData.getHTTPPostData().contains("AIQHUB-CIP-NACK-1012-LA")) {
                httpRequestData.setHTTPPostData(xmlStr);
                requestData.setService("AUTOMATIQ_HUB_LA");
                requestData.setAction("CIP-NACK-1012");
                return true;
            }
            if (httpRequestData.getHTTPPostData().contains("AIQHUB-CIP-NACK-1012-TAP")) {
                httpRequestData.setHTTPPostData(xmlStr);
                requestData.setService("AUTOMATIQ_HUB_TAX_AND_PAYROLL");
                requestData.setAction("CIP-NACK-1012");
                return true;
            }
            if (httpRequestData.getHTTPPostData().contains("AIQHUB-CIP-NACK-1012-SSA89")) {
                httpRequestData.setHTTPPostData(xmlStr);
                requestData.setService("AUTOMATIQ_HUB_SSA89");
                requestData.setAction("CIP-NACK-1012");
                return true;
            }
        }
        return false;
    }

}
