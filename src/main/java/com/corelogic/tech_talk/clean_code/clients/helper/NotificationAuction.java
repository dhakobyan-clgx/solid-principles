package com.corelogic.tech_talk.clean_code.clients.helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationAuction {

    private String auctionDate;

    private Integer auctionTime;

    private NotificationAuctionAddress auctionAddress;
}
