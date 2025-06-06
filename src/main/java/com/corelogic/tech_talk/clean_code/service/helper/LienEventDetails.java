package com.corelogic.tech_talk.clean_code.service.helper;

import lombok.Data;

@Data
public class LienEventDetails {
    private String documentTypeCode;

    private String documentTypeCodeDescription;

    private String documentNumber;

    private String recordingDate;

    private String recordingBook;

    private String recordingPage;

    private String originalRecordingDate;

    private String originalDocumentNumber;

    private String originalRecordingBook;

    private String originalRecordingPage;
}
