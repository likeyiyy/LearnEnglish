package com.example.learn_english.user.application.query.service.impl;

import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.application.query.service.UserQryService;
import com.example.learn_english.user.domain.repo.UserQryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:19 PM
 */
@Service
public class UserQryServiceImpl implements UserQryService {

    private final UserQryRepository userQryRepository;

    public UserQryServiceImpl(UserQryRepository userQryRepository) {
        this.userQryRepository = userQryRepository;
    }

    @Override
    public UserDTO getById(Long id) {
        return userQryRepository.getById(id);
    }


    @Override
    public List<UserDTO> getAll() {
        return userQryRepository.getAll();
    }
}
