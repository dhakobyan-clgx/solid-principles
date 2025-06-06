package com.corelogic.tech_talk.clean_code.interfaces.helper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlockProductNotFoundException extends RuntimeException {

    private int httpStatus;

    @NonNull
    private String message;
}
