package com.example.learn_english.word.infrasturcture.jpa.repository;

import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.word.domain.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:52 PM
 */
public interface WordRepositoryJpa extends JpaRepository<Word, Long>, JpaSpecificationExecutor<Word> {
    Word findByIdAndUser(Long id, User user);

    Word findByNameAndUser(String name, User user);

    List<Word> findByNameContainsAndUser(String name, User user);
}
