package com.corelogic.tech_talk.clean_code.clients.helper;

import com.corelogic.tech_talk.clean_code.service.helper.MortgageDeedOfTrustVoluntaryLienRelease;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Lien {
    private List<MortgageDeedOfTrustVoluntaryLien> mortgageDeedOfTrustVoluntaryLien;

    private ArrayList<MortgageDeedOfTrustVoluntaryLienRelease> mortgageDeedOfTrustVoluntaryLienRelease;

    private List<InvoluntaryLien> involuntaryLien;

    private List<InvoluntaryLienRelease> involuntaryLienRelease;

    private List<GovernmentAgencyInvoluntaryLienProperty> governmentAgencyInvoluntaryLienProperty;

    private List<GovernmentAgencyInvoluntaryLienReleaseProperty> governmentAgencyInvoluntaryLienReleaseProperty;

    private List<Assignment> assignment;

    private List<SolarContractVoluntaryLien> solarContractVoluntaryLien;

    private List<SolarContractVoluntaryLienRelease> solarContractVoluntaryLienRelease;

    private List<EnergyEfficientVoluntaryLien> energyEfficientVoluntaryLien;

    private List<EnergyEfficientVoluntaryLienRelease> energyEfficientVoluntaryLienRelease;

}
