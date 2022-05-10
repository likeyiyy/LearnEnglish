package com.example.learn_english.api.web.api.dto;

import com.example.learn_english.base.exception.StatusCodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:31 AM
 */
@Data
@AllArgsConstructor
public class ResponseDTO<T> {
    @ApiModelProperty(value = "错误码")
    private Integer errorCode;

    @ApiModelProperty(value = "错误详情")
    private String errorMessage;

    @ApiModelProperty(value = "数据")
    private T data;

    public ResponseDTO(StatusCodeEnum statusCodeEnum, T data) {
        this.errorCode = statusCodeEnum.getErrorCode();
        this.errorMessage = statusCodeEnum.getErrorMessage();
        this.data = data;
    }
}
