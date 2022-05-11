package com.example.learn_english.word.domain.repo;

import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.word.application.query.dto.WordDTO;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:48 PM
 */
public interface WordQryRepository {

    WordDTO findByIdAndUser(Long id, User user);
    WordDTO findByNameAndUser(String name, User user);

    List<WordDTO> findByNameContainsAndUserId(String name, User user);
}
