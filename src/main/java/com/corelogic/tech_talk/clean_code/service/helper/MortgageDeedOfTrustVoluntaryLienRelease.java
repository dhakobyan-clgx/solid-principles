package com.corelogic.tech_talk.clean_code.service.helper;

import lombok.Data;

@Data
public class MortgageDeedOfTrustVoluntaryLienRelease {
    private String compositeTransactionId;

    private LienEventDetails eventDetails;

}
