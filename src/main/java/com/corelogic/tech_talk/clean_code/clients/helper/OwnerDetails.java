package com.corelogic.tech_talk.clean_code.clients.helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDetails {

    @Schema(name = "sequenceNumber", description = "Sequence number.")
    private Integer nameSequenceNumber;

    @Schema(name = "fullName", description = "Full name of property owner.")
    private String fullName;

    @Schema(name = "firstName", description = "First name of property owner.")
    private String firstName;

    @Schema(name = "lastName", description = "Last name of property owner.")
    private String lastName;

    @Schema(name = "corporateIndicator", description = "Indicator that the property owner has been recognized as a corporation or business.")
    private String corporateIndicator;

    @Schema(name = "relationshipTypeCode", description = "Cotality derived code that indicates Relationship between multiple owners or the marital status of a single owner (e.g., Husband/Wife, Unmarried Man).")
    private String relationshipTypeCode;

    @Schema(name = "ownerBuyerEtAlIndicator", description = "A code appearing in this field indicates additional ownership, whose name(s) were not provided by our sources. Values are: A = ET AL - AND OTHERS C = ET CON - AND HUSBAND U = ET UX - AND WIFE V = ET VIR - AND HUSBAND.")
    private String ownerBuyerEtAlIndicator;

    @Schema(name = "ownershipRightsCode", description = "Cotality derived code that indicates form or method of property ownership (e.g., Joint Tenants, Living Trust).")
    private String ownershipRightsCode;
}
