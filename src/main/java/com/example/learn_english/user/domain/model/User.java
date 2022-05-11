package com.example.learn_english.user.domain.model;

import com.example.learn_english.base.domain.model.BaseModel;
import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.word.domain.model.Word;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class User extends BaseModel<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String openId;

    @Column
    private String nickName;

    @Column
    private String mobile;

    @Column
    private String avatarUrl;

    public User(
            String openId,
            String nickName,
            String mobile,
            String avatarUrl

    ) {
        this.openId = openId;
        this.nickName = nickName;
        this.mobile = mobile;
        this.avatarUrl = avatarUrl;
    }

    public static User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getOpenId(), userDTO.getNickName(), userDTO.getMobile(), userDTO.getAvatarUrl());
    }
}

