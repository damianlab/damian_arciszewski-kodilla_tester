package com.kodilla.collections.adv.immutable.Exercise.Association;

import java.util.List;

public class BookCollection {
    // reference to refer to list of publications.

    private final List<Publication> publications;

    BookCollection (List<Publication> publications) {
        this.publications = publications;
    }
    // metoda
    public List<Publication> getTotalBooksInCollection(){
        return publications;
    }
}
