package com.corelogic.tech_talk.clean_code.clients.helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationEventDetails {

    private String recordingDate;

    private String documentTypeCode;

    private String documentNumber;

    private String recordingBook;

    private String recordingPage;

}