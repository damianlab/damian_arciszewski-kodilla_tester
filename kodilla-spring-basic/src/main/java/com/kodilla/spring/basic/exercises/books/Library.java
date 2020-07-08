package com.kodilla.spring.basic.exercises.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    private BookIdGenerator bookIdGenerator;
    private BookRentalService bookRentalService;

    @Autowired
    public Library(BookIdGenerator bookIdGenerator, BookRentalService bookRentalService) {
        this.bookIdGenerator = bookIdGenerator;
        this.bookRentalService = bookRentalService;
    }

    public Book createExampleBook() {
        return new Book(bookIdGenerator.generateId(), "Adam Kowalski", "Costam");
    }

    public Book rentBook(Book book, User user) {
        return bookRentalService.rentBook(book, user);
    }
}
