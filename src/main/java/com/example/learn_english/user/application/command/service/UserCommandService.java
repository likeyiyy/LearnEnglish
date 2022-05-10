package com.example.learn_english.user.application.command.service;

import com.example.learn_english.user.application.command.cmd.CreateUserCommand;
import com.example.learn_english.user.application.command.cmd.UpdateUserCommand;

/**
 * @author keyi.lee
 * @date 2022-05-11 12:39 AM
 */
public interface UserCommandService {

    void create(CreateUserCommand userCommand);

    void update(UpdateUserCommand userCommand);
}
