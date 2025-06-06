package com.corelogic.tech_talk.clean_code.service.helper;

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
public class GraphqlResponse {

    private PropertyData data;

    private TotalRecords extensions;

    private List<GraphQLErrorResponse> errors;
}

