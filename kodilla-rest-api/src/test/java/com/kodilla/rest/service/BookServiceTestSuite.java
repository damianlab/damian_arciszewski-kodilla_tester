package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceTestSuite {

    @Autowired
    BookService bookService;

    @BeforeEach
    void setUp() {
        bookService.getBooks().removeAll(bookService.getBooks());
    }

    @Test
    public void shouldReturnEmptyList () {
        List<BookDto> books = bookService.getBooks();

        assertTrue(books.isEmpty());
    }

    @Test
    public void shouldAddBook () {
        bookService.addBook(new BookDto("Title1", "Author1"));
        bookService.addBook(new BookDto("Title2", "Author2"));

        assertEquals(2, bookService.getBooks().size());
    }

    @Test
    public void shouldRemoveBook () {
        BookDto bookDto = new BookDto("Title3", "Author3");
        bookService.addBook(bookDto);

        bookService.removeBook(bookDto);

        assertFalse(bookService.getBooks().contains(bookDto));
    }
}