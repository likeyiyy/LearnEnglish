package com.example.learn_english.user.application.command.cmd;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:20 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "Create User Form", description = "创建用户")
public class CreateUserCommand {
    @ApiModelProperty("名称")
    @Size(max = 100, message = "nickName must be between {min} and {max} characters long")
    @NotBlank(message = "name not blank")
    private String nickName;

    @ApiModelProperty("手机")
    @Size(min=11, max = 11, message = "nickName must be between {min} and {max} characters long")
    @NotBlank(message = "手机")
    private String mobile;

    @ApiModelProperty("头像")
    @Size(max = 255, message = "avatarLink must be between {min} and {max} characters long")
    private String avatarUrl;

    @ApiModelProperty("openId")
    private String openId;

}
