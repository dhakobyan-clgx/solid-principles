package com.corelogic.tech_talk.clean_code.clients.helper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FinalJudgment {

    private String chronologyNumber;

    private String categoryTypeCode;

    private NotificationAuction auction;

    private NotificationEventDetails eventDetails;

    private NotificationForeclosureDetails foreclosureDetails;

    private NotificationDetails notificationDetails;

    private NotificationOriginalMortgageDetails originalMortgageDetails;

    private List<NotificationPlaintiffDetails> plaintiffDetails;

    private NotificationPreparerDetails preparerDetails;

    private NotificationTitleEscrow titleEscrow;

}
