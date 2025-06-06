package com.corelogic.tech_talk.clean_code.service.helper;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MortgageHistoryLienEventDetails {

//    @Schema(name = "releaseDocumentTypeCode", description = "Type of release document recorded.")
    public String documentTypeCode;

//    @Schema(name = "releaseDocumentTypeCodeDescription", description = "Describes the release document type code.")
    public String documentTypeCodeDescription;

//    @Schema(name = "releaseRecordingDate", description = "The date the release transaction was recorded. Format:  YYYYMMDD.")
    public String recordingDate;
//    @Schema(name = "releaseDocumentNumber", description = "Recorder's release document number, used by some counties to record transactions.")
    public String documentNumber;

//    @Schema(name = "recordingBook", description = "The Book number used by some counties to record transactions.")
    public String recordingBook;

//    @Schema(name = "recordingPage", description = "The Page number used by some counties to record transactions.")
    public String recordingPage;

}
