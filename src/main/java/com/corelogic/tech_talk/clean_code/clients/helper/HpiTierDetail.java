package com.corelogic.tech_talk.clean_code.clients.helper;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HpiTierDetail {

    private Integer disNondisFlag;

    private String endDate;

    private BigDecimal homePriceIndex;

    private Integer repeatSalesCount;

    private BigDecimal repeatSalesMedian;

    private BigDecimal standardDeviation;

    private String startDate;

    private Integer tierCode;

    private String tierName;

    private BigDecimal volatilityIndex;
}
