package com.corelogic.tech_talk.clean_code.interfaces.helper;


import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;

public enum BlockProductEnum {

    // blocks in alphabetical order (for readability)
    ALL_BUILDINGS_SUMMARY("all-buildings-summary"),
    CENSUS_TRACT("census-tract"),
    CONSTRUCTION_DETAILS("construction-details"),
    CURRENT_OWNER_MAILING_INFO("current-owner-mailing-info"),
    CURRENT_OWNERS("current-owners"),
    INTERIOR_ROOMS("interior-rooms"),
    LAND_USE_ZONING_CODES("land-use-zoning-codes"),
    LIENS("liens"),
    ENRICHED_LIENS("enriched-liens"),
    PROPENSITY("propensity"),
    LOT_SIZE("lot-size"),
    MORTGAGE_HISTORY("mortgage-history"),
    TRANSACTION_HISTORY("transaction-history"),
    MUNICIPALITY("municipality"),
    NEIGHBORHOOD("neighborhood"),
    SITE_CHARACTERISTICS("site-characteristics"),
    STRUCTURE_EXTERIOR("structure-exterior"),
    STRUCTURE_INTERIOR("structure-interior"),
    UTILITIES_TYPE("utilities-type"),
    // products in alphabetical order
    BUILDINGS("buildings"),
    OWNERSHIP("ownership"),
    OWNERSHIP_TRANSFERS_ALL("ownership-transfers/all"),
    OWNERSHIP_TRANSFERS_ALL_LATEST("ownership-transfers/all/latest"),
    OWNERSHIP_TRANSFERS_MARKET("ownership-transfers/market"),
    OWNERSHIP_TRANSFERS_MARKET_LATEST("ownership-transfers/market/latest"),
    OWNERSHIP_TRANSFERS_NON_MARKET("ownership-transfers/non-market"),
    OWNERSHIP_TRANSFERS_NON_MARKET_LATEST("ownership-transfers/non-market/latest"),
    SITE_INFORMATION("site-information"),
    SITE_LOCATION("site-location"),
    TAX_ASSESSMENTS_LATEST("tax-assessments/latest"),
    RENT_AMOUNT_MODEL("rent-amount-model"),
    BUILDING_PERMITS("building-permits");

    private String blockProductName;

    BlockProductEnum(String blockProductName) {
        this.blockProductName = blockProductName;
    }

    public String getBlockProductName() {
        return blockProductName;
    }

    public static BlockProductEnum getEnum(String blockProductName) {
        for (BlockProductEnum blockProductEnum : BlockProductEnum.values()) {
            if (blockProductEnum.getBlockProductName().equals(blockProductName)) {
                return blockProductEnum;
            }
        }
        throw new BlockProductNotFoundException(HttpStatus.NOT_FOUND.value(), StringUtils.join(blockProductName, " specified in api.features.includeBlocks is invalid."));
    }
}
