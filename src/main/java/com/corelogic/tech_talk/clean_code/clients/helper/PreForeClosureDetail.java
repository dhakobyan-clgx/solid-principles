package com.corelogic.tech_talk.clean_code.clients.helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreForeClosureDetail {

    private String clip;

    private PropertyEvents propertyEvents;
}
