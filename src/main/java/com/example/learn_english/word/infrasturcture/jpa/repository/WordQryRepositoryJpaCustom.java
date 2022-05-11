package com.example.learn_english.word.infrasturcture.jpa.repository;

import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.word.application.query.dto.WordDTO;
import com.example.learn_english.word.domain.model.Word;
import com.example.learn_english.word.domain.repo.WordQryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:52 PM
 */
@Repository
public class WordQryRepositoryJpaCustom implements WordQryRepository {
    @Autowired
    WordRepositoryJpa wordRepositoryJpa;

    @Override
    public WordDTO findByIdAndUser(Long id, User user) {
        return Optional.of(wordRepositoryJpa.findByIdAndUser(id, user)).map(WordDTO::fromEntity).orElse(null);
    }

    @Override
    public WordDTO findByNameAndUser(String name, User user) {
        return Optional.of(wordRepositoryJpa.findByNameAndUser(name, user)).map(WordDTO::fromEntity).orElse(null);
    }

    @Override
    public List<WordDTO> findByNameContainsAndUserId(String name, User user) {
        return wordRepositoryJpa.findByNameContainsAndUser(name, user).stream().map(WordDTO::fromEntity).collect(Collectors.toList());
    }
}
