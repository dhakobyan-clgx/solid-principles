package com.corelogic.tech_talk.clean_code.clients.before;

import com.corelogic.tech_talk.clean_code.clients.helper.HomeShopperDetail;
import com.corelogic.tech_talk.clean_code.clients.helper.Messages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeShopperResponse {

    private List<Messages> messages;

    private Integer totalRecords;

    private List<HomeShopperDetail> clips;
}
