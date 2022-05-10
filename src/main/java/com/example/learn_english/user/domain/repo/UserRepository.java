package com.example.learn_english.user.domain.repo;

import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.domain.model.User;

/**
 * @author keyi.lee
 * @date 2022-05-10 10:28 PM
 */
public interface UserRepository {

    User create(User user);

    User update(UserDTO userDTO);
}
