package com.example.learn_english.user.application.query.dto;

import com.example.learn_english.user.application.command.cmd.UpdateUserCommand;
import com.example.learn_english.user.domain.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.stream.Collectors;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:07 PM
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "User", description = "用户详情")
public class UserDTO {
    @ApiModelProperty("用户ID")
    private Long id;

    @ApiModelProperty("用户openId")
    private String openId;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户手机号")
    private String mobile;

    @ApiModelProperty("用户头像")
    private String avatarUrl;

    public static UserDTO fromEntity(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .nickName(user.getNickName())
                .avatarUrl(user.getAvatarUrl())
                .mobile(user.getMobile())
                .build();
    }
    public static UserDTO fromCommand(UpdateUserCommand updateUserCommand) {
        return UserDTO.builder()
                .id(updateUserCommand.getId())
                .nickName(updateUserCommand.getNickName())
                .openId(updateUserCommand.getOpenId())
                .avatarUrl(updateUserCommand.getAvatarUrl())
                .mobile(updateUserCommand.getMobile())
                .build();
    }

}
