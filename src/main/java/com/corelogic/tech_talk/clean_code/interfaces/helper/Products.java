package com.corelogic.tech_talk.clean_code.interfaces.helper;


public interface Products {

    BuildingResponseData getBuildings();

    OwnershipResponseData getOwnership();

    SiteLocationResponseData getSiteLocation();

    TaxAssessment getTaxAssessmentLatest();

    OwnershipTransfersProduct getOwnershipTransfersAllLatest();

    OwnershipTransfersProduct getOwnershipTransfersMarketLatest();

    void setBuildings(BuildingResponseData buildings);

    void setOwnership(OwnershipResponseData ownership);

    void setSiteLocation(SiteLocationResponseData siteLocation);

    void setTaxAssessmentLatest(TaxAssessment taxAssessmentLatest);

    void setOwnershipTransfersAllLatest(OwnershipTransfersProduct ownershipTransfersAllLatest);

    void setOwnershipTransfersMarketLatest(OwnershipTransfersProduct ownershipTransfersMarketLatest);

}
