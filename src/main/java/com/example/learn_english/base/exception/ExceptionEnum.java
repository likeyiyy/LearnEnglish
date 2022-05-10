package com.example.learn_english.base.exception;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:34 AM
 */
public interface ExceptionEnum {
    Integer getHttpStatusCode();

    Integer getErrorCode();

    String getErrorMessage();
}
