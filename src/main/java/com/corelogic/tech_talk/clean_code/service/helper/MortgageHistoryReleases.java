package com.corelogic.tech_talk.clean_code.service.helper;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MortgageHistoryReleases {
//    @Schema(name = "compositeTransactionId", description = "Unique release transaction key comprised of FIPS Code, Transaction Batch Date, Transaction Sequence Number, and either Mortgage Sequence Number if record reflects mortgage data content or '000' if record does not reflect mortgage data content.")
    public String compositeTransactionId;
//    @Schema()
    public MortgageHistoryLienEventDetails eventDetails;
//    @Schema()
    public MortgageHistoryOriginalMortgageDetails originalMortgageDetails;

}
