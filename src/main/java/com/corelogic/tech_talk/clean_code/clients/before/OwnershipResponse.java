package com.corelogic.tech_talk.clean_code.clients.before;


import com.corelogic.tech_talk.clean_code.clients.helper.PropertyOwnershipDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OwnershipResponse {

    private Integer totalRecords;

    private List<PropertyOwnershipDetail> clips;
}
