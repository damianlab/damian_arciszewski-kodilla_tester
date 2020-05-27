package com.kodilla.collections.adv.immutable.Exercise.Association;

import java.util.Objects;

public class Publication {

    public String title;
    public String author;

    Publication(String title, String author) {
        this.title = title;
        this.author = author;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
