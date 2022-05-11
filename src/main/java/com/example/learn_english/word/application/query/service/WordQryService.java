package com.example.learn_english.word.application.query.service;

import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.word.application.query.dto.WordDTO;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-11 9:29 PM
 */
public interface WordQryService {

    WordDTO findByIdAndUserId(Long id, User user);
    WordDTO findByNameAndUserId(String name, User user);

    List<WordDTO> findByNameContainsAndUserId(String name, User user);
}
