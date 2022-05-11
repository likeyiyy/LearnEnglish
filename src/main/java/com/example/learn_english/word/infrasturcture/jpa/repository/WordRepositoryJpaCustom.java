package com.example.learn_english.word.infrasturcture.jpa.repository;

import com.example.learn_english.word.domain.model.Word;
import com.example.learn_english.word.domain.repo.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:51 PM
 */
@Repository
public class WordRepositoryJpaCustom implements WordRepository {
    @Autowired WordRepositoryJpa wordRepositoryJpa;

    @Override
    public Word create(Word word) {
        return wordRepositoryJpa.save(word);
    }
}
