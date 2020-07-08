package com.kodilla.spring.basic.exercises.books;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfiguration {

    @Bean
    public BookIdGenerator bookIdGenerator() {
        return new BookIdGenerator(10);
    }

}
