package com.kodilla.collections.adv.immutable.special.homework;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() { // public final String getAuthor
        return author;
    }

    public String getTitle() { // public final String getTitle
        return title;
    }

}
