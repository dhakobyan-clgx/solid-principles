package com.corelogic.tech_talk.clean_code.service.after;

import com.corelogic.tech_talk.clean_code.service.helper.MortgageHistoryMapper;
import com.corelogic.tech_talk.clean_code.service.helper.MortgageHistoryReleases;
import com.corelogic.tech_talk.clean_code.service.helper.Property;

import java.util.List;

public class MortgageHistoryService {
    private final MortgageHistoryMapper mortgageHistoryMapper;

    public MortgageHistoryService(MortgageHistoryMapper mortgageHistoryMapper) {
        this.mortgageHistoryMapper = mortgageHistoryMapper;
    }

    // After: The code is more maintainable because of its cleaner structure and use of modern Java practices.
    private void mapReleases(Property property, List<MortgageHistoryReleases> releases) {
        if (isEmptyMortgageDeedOfTrustVoluntaryLienRelease(property)) return;

        property.getPropertyEvents().getCategory().getLien().getMortgageDeedOfTrustVoluntaryLienRelease()
                .forEach(release -> releases.add(mortgageHistoryMapper.mapMortgageDeedOfTrustVoluntaryLienRelease(release)));
    }

    private static boolean isEmptyMortgageDeedOfTrustVoluntaryLienRelease(Property property) {
        return property.getPropertyEvents() == null ||
               property.getPropertyEvents().getCategory() == null ||
               property.getPropertyEvents().getCategory().getLien() == null ||
               property.getPropertyEvents().getCategory().getLien().getMortgageDeedOfTrustVoluntaryLienRelease() == null ||
               property.getPropertyEvents().getCategory().getLien().getMortgageDeedOfTrustVoluntaryLienRelease().isEmpty();
    }
}
// Summary
// The "after" version improves readability, uses modern Java features like forEach, and simplifies null checks, making the code cleaner and easier to maintain.