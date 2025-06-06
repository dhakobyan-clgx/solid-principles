package com.corelogic.tech_talk.clean_code.clients.before;

import com.corelogic.tech_talk.clean_code.clients.helper.ValuationDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValuationsResponse {

    private List<Messages> messages;

    private Integer totalRecords;

    private List<ValuationDetail> clips;
}
