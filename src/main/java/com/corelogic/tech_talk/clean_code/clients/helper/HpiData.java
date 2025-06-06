package com.corelogic.tech_talk.clean_code.clients.helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HpiData {

    private String clip;

    private IndicesDetail indices;

}
