package com.kodilla.collections.adv.immutable.special.homework;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {
    private Set<Book> bookSet;

    public BookManager() {
        this.bookSet = new HashSet<>();
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if(!bookSet.contains(book)) {
            bookSet.add(book);
            return book;
        }
        for (Book book1 : bookSet) {
            if (book1.equals(book))  {
                return book1;
            }
        }
        return null;
    }
}