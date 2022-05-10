package com.example.learn_english.base.exception;

import lombok.Getter;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:33 AM
 */

@Getter
public enum StatusCodeEnum implements ExceptionEnum {
    OK(200, 0, "ok");
    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String errorMessage;

    StatusCodeEnum(Integer httpStatusCode, Integer errorCode, String errorMessage) {
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
