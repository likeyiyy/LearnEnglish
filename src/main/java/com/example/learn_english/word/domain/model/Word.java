package com.example.learn_english.word.domain.model;

import com.example.learn_english.base.domain.model.BaseModel;
import com.example.learn_english.user.domain.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:41 PM
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Word extends BaseModel<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String trans;

    @Column
    private Long times;

    @ManyToOne
    @JoinColumn(name="user_id", foreignKey = @ForeignKey(name="fk_word_user_id"))
    private User user;

}
