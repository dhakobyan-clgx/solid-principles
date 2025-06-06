package com.corelogic.tech_talk.clean_code.clients.helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Notification {

    private List<FinalJudgment> finalJudgment;

    private List<LisPendens> lisPendens;

    private List<NoticeOfDefaultOrTrusteeSale> noticeOfDefaultOrTrusteeSale;

    private List<NoticeOfDefaultOrLisPendensRescission> noticeOfDefaultOrLisPendensRescission;
}
