package com.example.learn_english.user.application.query.service;

import com.example.learn_english.user.application.query.dto.UserDTO;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:05 PM
 */
public interface UserQryService {
    UserDTO getById(Long id);
    List<UserDTO> getAll();
}
