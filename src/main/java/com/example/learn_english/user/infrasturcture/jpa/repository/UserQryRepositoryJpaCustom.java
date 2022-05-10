package com.example.learn_english.user.infrasturcture.jpa.repository;

import com.example.learn_english.user.application.query.dto.UserDTO;
import com.example.learn_english.user.domain.repo.UserQryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author keyi.lee
 * @date 2022-05-10 11:28 PM
 */
@Repository
public class UserQryRepositoryJpaCustom implements UserQryRepository {
    @Autowired private UserRepositoryJpa userQrwRepositoryJpa;


    @Override
    public UserDTO getById(Long id) {
        return Optional.of(userQrwRepositoryJpa.getById(id)).map(UserDTO::fromEntity).orElse(null);
    }

    @Override
    public List<UserDTO> getAll() {
        return userQrwRepositoryJpa.findAll().stream().map(UserDTO::fromEntity).collect(Collectors.toList());
    }

}
