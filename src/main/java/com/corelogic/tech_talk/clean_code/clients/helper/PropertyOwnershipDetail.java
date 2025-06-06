package com.corelogic.tech_talk.clean_code.clients.helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyOwnershipDetail {

    private String clip;

    private String absenteeOwnerCode;

    private List<Owners> owners;
}
