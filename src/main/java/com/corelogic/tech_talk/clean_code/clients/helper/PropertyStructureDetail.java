package com.corelogic.tech_talk.clean_code.clients.helper;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyStructureDetail {

    private String clip;
    private PropertyStructureAttribute propertyAttributes;
    private PropertyStructureLand land;
    private List<StructureAttribute> structure;

}
