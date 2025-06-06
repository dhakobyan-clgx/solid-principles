package com.corelogic.tech_talk.clean_code.service.helper;

import com.corelogic.tech_talk.clean_code.clients.helper.PropertyEvents;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Property {
    private String clip;

    private String apnFormatted;

    private Integer apnSequenceNumber;

    private String apnUnformatted;

    private String countyFipsCode;

    private String countyName;

    private GeoCode geocode;

    private Hazard hazard;

    private List<PreviousAssessorsKey> previousAssessorsKey;

    private Propensity propensity;

    private PropertyAnalytics propertyAnalytics;

    private PropertyCharacteristics propertyCharacteristics;

    private PropertyEvents propertyEvents;

    private PropertyState propertyState;

    private PropertyTax propertyTax;

    private PropertyEnriched propertyEnriched;

    private Valuation valuation;

    private Indices indices;

    private Trends trends;

    private List<RelatedAddress> relatedAddress;

    private SitusAddress situsAddress;

    private Integer universalParcelIdentification;

    private UsageRestriction usageRestriction;

    private Land land;

    private List<LandParcels> landParcels;

    private List<Structures> structures;

    private SummaryDataLandParcel summaryDataLandParcel;

    private LandParcel landParcel;

    private Structure structure;

    private List<ClimateRiskAnalytics> climateRiskAnalytics;

    private String geometry;

    private GeometryFormat geometryFormat;

    private BigDecimal comparableDistance;
}
