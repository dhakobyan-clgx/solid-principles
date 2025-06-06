package com.corelogic.tech_talk.clean_code.clients.helper;

import lombok.Data;

@Data
public class ActivitySummary {
    private Integer listingPriceAverageLowValue;

    private Integer listingPriceAverageHighValue;

    private String startedShoppingDate;

    private String lastActivityDate;

    private Boolean inStateVisitedIndicator;

    private Boolean outOfStateVisitedIndicator;

    private Boolean lowToModerateIncomeHomeShopperOpportunityIndicator;

    private Integer lowToModerateIncomePropertyVisitedCount;
}
