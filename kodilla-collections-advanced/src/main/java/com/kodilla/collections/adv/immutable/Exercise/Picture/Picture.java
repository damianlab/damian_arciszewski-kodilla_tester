package com.kodilla.collections.adv.immutable.Exercise.Picture;

import java.util.Objects;

public class Picture {
    private String author;
    private String title;

    public Picture(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Picture)) return false;
        Picture piture = (Picture) o;
        return Objects.equals(getAuthor(), piture.getAuthor()) &&
                Objects.equals(getTitle(), piture.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle());
    }

    @Override
    public String toString() {
        return "Piture{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
