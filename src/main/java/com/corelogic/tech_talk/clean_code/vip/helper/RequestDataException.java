package com.corelogic.tech_talk.clean_code.vip.helper;

public class RequestDataException extends Exception {
    public RequestDataException() {
    }

    public RequestDataException(String message) {
        super(message);
    }

    public RequestDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestDataException(Throwable cause) {
        super(cause);
    }

    public RequestDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
