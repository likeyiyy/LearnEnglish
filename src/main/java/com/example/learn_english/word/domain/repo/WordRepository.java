package com.example.learn_english.word.domain.repo;

import com.example.learn_english.word.domain.model.Word;

/**
 * @author keyi.lee
 * @date 2022-05-11 8:48 PM
 */
public interface WordRepository {

    Word create(Word word);
}
