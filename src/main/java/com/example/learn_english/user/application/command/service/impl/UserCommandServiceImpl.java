package com.example.learn_english.user.application.command.service.impl;

import com.example.learn_english.user.application.command.cmd.CreateUserCommand;
import com.example.learn_english.user.application.command.cmd.UpdateUserCommand;
import com.example.learn_english.user.application.command.service.UserCommandService;
import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.user.domain.repo.UserQryRepository;
import com.example.learn_english.user.domain.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:40 AM
 */
@Service
@Slf4j
public class UserCommandServiceImpl implements UserCommandService {
    private final UserRepository userRepository;
    private final UserQryRepository userQryRepository;

    public UserCommandServiceImpl(UserRepository userRepository, UserQryRepository userQryRepository) {
        this.userRepository = userRepository;
        this.userQryRepository = userQryRepository;
    }

    @Override
    public void create(CreateUserCommand userCommand) {
        var user = new User(
                userCommand.getOpenId(),
                userCommand.getNickName(),
                userCommand.getMobile(),
                userCommand.getAvatarUrl()
        );
        userRepository.create(user);
    }

    @Override
    public void update(UpdateUserCommand userCommand) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userCommand.getId())
                .setNickName(userCommand.getNickName())
                .setMobile(userCommand.getMobile())
                .setOpenId(userCommand.getOpenId())
                .setAvatarUrl(userCommand.getAvatarUrl());
        userRepository.update(userDTO);
    }
}
