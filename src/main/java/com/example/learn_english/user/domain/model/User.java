package com.example.learn_english.user.domain.model;

import com.example.learn_english.base.domain.model.BaseModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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

}

