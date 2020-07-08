package com.kodilla.spring.basic.exercises.books;

import org.springframework.stereotype.Service;

@Service
public class BookRentalService {

    public Book rentBook(Book book, User user) {
        if (!user.isInHisDebt() && !book.isRented()) {
            book.setRented(true);
        } else {
            throw new BookNotAvailableException();
        }

        return book;
    }

}
