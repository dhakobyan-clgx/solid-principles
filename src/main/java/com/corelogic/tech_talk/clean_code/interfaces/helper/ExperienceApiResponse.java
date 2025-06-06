package com.corelogic.tech_talk.clean_code.interfaces.helper;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExperienceApiResponse implements Products {

    @JsonProperty(value = "allBuildingsSummary")
    private AllBuildingsSummaryResponseData allBuildingsSummary;
    private BuildingResponseData buildings;
    @JsonProperty(value = "censusTract")
    private CensusTractResponseData censusTract;
    @JsonProperty(value = "constructionDetails")
    private ConstructionDetailsResponseData constructionDetails;
    @JsonProperty(value = "currentOwnerMailingInfo")
    private CurrentOwnerMailingInfoResponseData currentOwnerMailingInfo;
    @JsonProperty(value = "currentOwners")
    private CurrentOwnersResponseData currentOwners;
    @JsonProperty(value = "interiorRooms")
    private InteriorRoomsResponseData interiorRooms;
    @JsonProperty(value = "landUseZoningCodes")
    private LandUseAndZoningCodesResponseData landUseZoningCodes;
    @JsonProperty(value = "lotSize")
    private LotSizeResponseData lotSize;
    private MunicipalityResponseData municipality;
    private NeighborhoodResponseData neighborhood;
    private OwnershipResponseData ownership;
    @JsonProperty(value = "siteCharacteristics")
    private SiteCharacteristicsResponseData siteCharacteristics;
    @JsonProperty(value = "siteInformation")
    private SiteInformationResponseData siteInformation;
    @JsonProperty(value = "siteLocation")
    private SiteLocationResponseData siteLocation;
    @JsonProperty(value = "structureExterior")
    private StructureExteriorResponseData structureExterior;
    @JsonProperty(value = "structureInterior")
    private StructureInteriorResponseData structureInterior;
    @JsonProperty(value = "taxAssessment")
    private TaxAssessment taxAssessmentLatest;
    @JsonProperty(value = "utilitiesType")
    private UtilitiesTypeResponseData utilitiesType;

    @JsonProperty(value ="ownerTransferHistory")
    private OwnershipTransfersProduct ownershipTransfersAll;
    @JsonProperty(value ="mostRecentOwnerTransfer")
    private OwnershipTransfersProduct ownershipTransfersAllLatest;
    @JsonProperty(value ="salesHistory")
    private OwnershipTransfersProduct ownershipTransfersMarket;
    @JsonProperty(value ="lastMarketSale")
    private OwnershipTransfersProduct ownershipTransfersMarketLatest;
    @JsonProperty(value = "rentAmountModel")
    private RentAmountModelResponseData rentAmountModelResponseData;
}
