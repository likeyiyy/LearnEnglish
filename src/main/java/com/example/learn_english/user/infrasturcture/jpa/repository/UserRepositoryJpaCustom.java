package com.example.learn_english.user.infrasturcture.jpa.repository;

import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.user.domain.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author keyi.lee
 * @date 2022-05-10 10:31 PM
 */
@Repository
public class UserRepositoryJpaCustom implements UserRepository {
    @Autowired
    private UserRepositoryJpa userRepositoryJpa;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User create(User user) {
        return userRepositoryJpa.save(user);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User update(UserDTO userDTO) {
        User user = userRepositoryJpa.getById(userDTO.getId());
        user.setNickName(userDTO.getNickName())
                .setMobile(userDTO.getMobile())
                .setOpenId(userDTO.getOpenId())
                .setAvatarUrl(userDTO.getAvatarUrl());
        return userRepositoryJpa.save(user);
    }
}
