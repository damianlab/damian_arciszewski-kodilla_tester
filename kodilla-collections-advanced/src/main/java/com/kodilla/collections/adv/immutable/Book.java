package com.kodilla.collections.adv.immutable;

public class Book { // public final class Book
    protected String author; // protected final String author;
    protected String title; // protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() { // public final String getAuthor
        return author;
    }

    public String getTitle() { // public final String getTitle
        return title;
    }


}
