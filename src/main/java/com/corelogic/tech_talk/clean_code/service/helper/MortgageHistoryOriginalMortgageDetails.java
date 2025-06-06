package com.corelogic.tech_talk.clean_code.service.helper;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MortgageHistoryOriginalMortgageDetails implements Serializable {

//    @Schema(name = "mortgageRecordingDate", description = "Recording Date of the subject transaction associated with this event. Format = YYYYMMDD. Document sourced, refers to prior associated transaction. Typically refers back to the Recording Date of the Deed of Trust/Mortgage.")
    public Integer mortgageRecordingDate;

//    @Schema(name = "mortgageDocumentNumber", description = "Document Number of the subject transaction associated with this event. Document sourced, refers to prior associated transaction. Typically refers back to the Document Number of the Deed of Trust/Mortgage.")
    public String mortgageDocumentNumber;

//    @Schema(name = "mortgageRecordingBook", description = "Document Book Number of the subject transaction associated with this event. Document sourced, refers to prior associated transaction. Typically refers back to the Document Book Number of the Deed of Trust/Mortgage.")
    public String mortgageRecordingBook;

//    @Schema(name = "mortgageRecordingPage", description = "Document Page Number of the subject transaction associated with this event. Document sourced, refers to prior associated transaction. Typically refers back to the Document Page Number of the Deed of Trust/Mortgage")
    public String mortgageRecordingPage;
}