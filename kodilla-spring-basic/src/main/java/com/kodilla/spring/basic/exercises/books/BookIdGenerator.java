package com.kodilla.spring.basic.exercises.books;

import java.util.UUID;

public class BookIdGenerator {

    private final int idLength;

    public BookIdGenerator(int idLength) {
        this.idLength = idLength;
    }

    public String generateId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, idLength);
    }
}
