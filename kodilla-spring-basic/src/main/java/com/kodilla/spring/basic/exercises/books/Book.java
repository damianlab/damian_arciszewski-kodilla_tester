package com.kodilla.spring.basic.exercises.books;

public class Book {
    private String id;
    private String author;
    private String title;
    private boolean isRented;

    public Book(String id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.isRented = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
