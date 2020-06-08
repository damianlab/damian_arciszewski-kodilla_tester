package com.kodilla.collections.adv.immutable.Exercise.publication;

import java.util.List;

public class PublicationCollection {
    // reference to refer to list of publications.

    private final List<Publication> publications;

    PublicationCollection (List<Publication> publications) {
        this.publications = publications;
    }
    // metoda
    public List<Publication> getTotalBooksInCollection(){
        return publications;
    }
}