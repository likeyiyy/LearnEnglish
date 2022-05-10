package com.example.learn_english.user.domain.repo;

import com.example.learn_english.user.application.query.dto.UserDTO;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:23 PM
 */
public interface UserQryRepository {
    UserDTO getById(Long id);
    List<UserDTO> getAll();
}
