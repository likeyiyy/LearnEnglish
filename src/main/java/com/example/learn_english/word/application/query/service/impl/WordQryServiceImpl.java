package com.example.learn_english.word.application.query.service.impl;

import com.example.learn_english.user.domain.model.User;
import com.example.learn_english.word.application.query.dto.WordDTO;
import com.example.learn_english.word.application.query.service.WordQryService;
import com.example.learn_english.word.domain.repo.WordQryRepository;
import com.example.learn_english.word.domain.repo.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author keyi.lee
 * @date 2022-05-11 9:31 PM
 */

@Service
public class WordQryServiceImpl implements WordQryService {

    private final WordQryRepository wordQryRepository;
    private final WordRepository wordRepository;

    public WordQryServiceImpl(WordQryRepository wordQryRepository, WordRepository wordRepository) {
        this.wordQryRepository = wordQryRepository;
        this.wordRepository = wordRepository;
    }

    @Override
    public WordDTO findByIdAndUserId(Long id, User user) {
        return wordQryRepository.findByIdAndUser(id, user);
    }

    @Override
    public WordDTO findByNameAndUserId(String name, User user) {
        return wordQryRepository.findByNameAndUser(name, user);
    }

    @Override
    public List<WordDTO> findByNameContainsAndUserId(String name, User user) {
        return wordQryRepository.findByNameContainsAndUserId(name, user);
    }
}
