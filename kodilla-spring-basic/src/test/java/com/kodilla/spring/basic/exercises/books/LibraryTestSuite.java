package com.kodilla.spring.basic.exercises.books;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LibraryTestSuite {

    @Test
    public void shouldRentBookIfAvailable () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Library library = context.getBean(Library.class);

        Book exampleBook = library.createExampleBook();
        User user = new User(1L, "Adam", "Jakis");

        Book rentedBook = library.rentBook(exampleBook, user);
        assertTrue(rentedBook.isRented());
    }

    @Test
    public void shouldThrowExceptionIfBookNotAvailable () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Library library = context.getBean(Library.class);

        Book exampleBook = library.createExampleBook();
        exampleBook.setRented(true);

        User user = new User(1L, "Adam", "Jakis");

        assertThrows(BookNotAvailableException.class, () -> {
            library.rentBook(exampleBook, user);
        });
    }

    @Test
    public void shouldGenerateBookId () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.exercises");
        Library library = context.getBean(Library.class);

        Book exampleBook = library.createExampleBook();
        System.out.println(exampleBook.getId());

        assertEquals(10, exampleBook.getId().length());
    }

}