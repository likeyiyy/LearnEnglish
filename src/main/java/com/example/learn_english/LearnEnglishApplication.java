package com.example.learn_english;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnEnglishApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LearnEnglishApplication.class, args);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
