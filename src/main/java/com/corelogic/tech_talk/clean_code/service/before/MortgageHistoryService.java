package com.corelogic.tech_talk.clean_code.service.before;

import com.corelogic.tech_talk.clean_code.service.helper.MortgageDeedOfTrustVoluntaryLienRelease;
import com.corelogic.tech_talk.clean_code.service.helper.MortgageHistoryMapper;
import com.corelogic.tech_talk.clean_code.service.helper.MortgageHistoryReleases;
import com.corelogic.tech_talk.clean_code.service.helper.Property;

import java.util.List;
import java.util.Objects;

public class MortgageHistoryService {

    private final MortgageHistoryMapper mortgageHistoryMapper;

    public MortgageHistoryService(MortgageHistoryMapper mortgageHistoryMapper) {
        this.mortgageHistoryMapper = mortgageHistoryMapper;
    }

    // Before: The code is functional but less maintainable due to its verbosity and tightly coupled logic.
    private void mapReleases(Property property, List<MortgageHistoryReleases> releases) {
        if (Objects.nonNull(property.getPropertyEvents()) && Objects.nonNull(property.getPropertyEvents().getCategory()) && Objects.nonNull(property.getPropertyEvents().getCategory().getLien()) && !property.getPropertyEvents().getCategory().getLien().getMortgageDeedOfTrustVoluntaryLienRelease().isEmpty()) {
            for (MortgageDeedOfTrustVoluntaryLienRelease mortgageDeedOfTrustVoluntaryLienRelease : property.getPropertyEvents().getCategory().getLien().getMortgageDeedOfTrustVoluntaryLienRelease()) {
                releases.add(mortgageHistoryMapper.mapMortgageDeedOfTrustVoluntaryLienRelease(mortgageDeedOfTrustVoluntaryLienRelease));
            }
        }
    }

}
