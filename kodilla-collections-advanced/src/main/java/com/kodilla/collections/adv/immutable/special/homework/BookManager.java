package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {
    // pole
    private Set<Book> bookSet;
    public BookManager() {
        this.bookSet = new HashSet<>();
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (!bookSet.contains(book)) {
            bookSet.add(book);
            return book;
        }

        for (Book bk : bookSet) {

            if (bk.equals(book)) {
                return bk;
            }
            }
            return null;
        }



    }
