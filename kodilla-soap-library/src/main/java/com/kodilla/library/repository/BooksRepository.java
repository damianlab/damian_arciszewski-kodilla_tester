package com.kodilla.library.repository;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book book1 = new Book();
        book1.setSignature("2121");
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        book1.setReleaseDate(1967);
        book1.setGenre(Genre.SCI_FI);
        books.put(book1.getSignature(), book1);

        Book book2 = new Book();
        book2.setSignature("2122");
        book2.setTitle("Book 2");
        book2.setAuthor("Author 2");
        book2.setReleaseDate(1980);
        book2.setGenre(Genre.FANTASY);
        books.put(book2.getSignature(), book2);

        Book book3 = new Book();
        book3.setSignature("2123");
        book3.setTitle("Book 3");
        book3.setAuthor("Author 3");
        book3.setReleaseDate(1995);
        book3.setGenre(Genre.CRIME);
        books.put(book3.getSignature(), book3);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}
