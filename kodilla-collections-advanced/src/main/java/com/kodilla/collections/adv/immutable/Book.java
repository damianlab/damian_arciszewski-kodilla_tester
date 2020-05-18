package com.kodilla.collections.adv.immutable;

public final class Book { // public final class Book
    protected final String author; // protected final String author;
    protected final String title; // protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() { // public final String getAuthor
        return author;
    }

    public final String getTitle() { // public final String getTitle
        return title;
    }


}
