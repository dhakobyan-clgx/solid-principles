package com.corelogic.tech_talk.clean_code.vip.after;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EPCMercuryService {
    // TODO: Use this concept to simplify the code and make it more readable
    private final List<String> tags = List.of("_AddDocument", "_UpdatePayment",
            "_EmailNotification", "_Comment", "_CommentWithAction", "_Cancellation",
            "_Delayed", "_OnHold", "_OffHold", "_Correction", "_CorrectionCancelled",
            "_RevisionNeeded", "_RequestRevision-ROV", "_CancelRevision-ROV","MercuryNetworkJsonResponse");

    private final List<String> tags2 = List.of("_NACKUpdatePayment", "_NACKCancellation",
            "_NACKDelayed", "_NACKOnHold", "_NACKOffHold", "_NACKCorrectionCancelled",
            "_NACKCorrection", "_NACKRequestRevision-ROV", "_NACKRevisionNeeded",
            "_NACKCancelRevision-ROV","_NackEmailNotification");

    private final List<String> tags3 = List.of("_NACKComment", "_NACKCommentWithAction");

    public EPCMercuryService() {
    }

    public boolean containsTag(String postData) {
        return tags.stream().anyMatch(postData::contains) ||
               postData.contains("_NACKAddDocument") ||
               tags2.stream().anyMatch(postData::contains) ||
               tags3.stream().anyMatch(postData::contains) ||
               postData.contains("_Update");
    }

    public String getAction(String postData) {
        if (tags.stream().anyMatch(postData::contains)) {
            return "AddDocumentResponse";
        }
        if (postData.contains("_NACKAddDocument")) {
            return "AddDocumentResponseNack";
        }
        if (tags2.stream().anyMatch(postData::contains)) {
            return "UpdatePaymentResponseNack";
        }
        if (tags3.stream().anyMatch(postData::contains)) {
            return "UpdatePaymentResponseNack";
        }
        if (postData.contains("_UpdateError")) {
            return "UpdateResponseError";
        }
        if (postData.contains("_Update")) {
            return "UpdateResponse";
        }
        // Using containsTag() method guarantees that this will never be reached
        throw new RuntimeException("Invalid action");
    }
}