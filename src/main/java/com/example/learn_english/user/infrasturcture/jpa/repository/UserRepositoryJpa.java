package com.example.learn_english.user.infrasturcture.jpa.repository;

import com.example.learn_english.user.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @author keyi.lee
 * @date 2022-05-10 10:31 PM
 */
public interface UserRepositoryJpa extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
