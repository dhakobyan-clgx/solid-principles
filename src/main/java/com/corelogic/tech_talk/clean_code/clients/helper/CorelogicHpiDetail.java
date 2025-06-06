package com.corelogic.tech_talk.clean_code.clients.helper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorelogicHpiDetail {

    private String countyFipsCode;

    private String countyName;

    private String dataPeriod;

    private String lastUpdateDate;

    private String state;

    private String stateName;

    private Integer yearMonth;

    private String zipCode;

    private List<HpiTierDetail> hpiTier;

}
