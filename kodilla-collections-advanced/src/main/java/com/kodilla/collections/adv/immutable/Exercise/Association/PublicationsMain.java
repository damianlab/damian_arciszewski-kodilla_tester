package com.kodilla.collections.adv.immutable.Exercise.Association;

import java.util.ArrayList;
import java.util.List;

public class PublicationsMain {
    public static void main(String[] args) {

        // Creating the Objects of Publication class.
        Publication p1 = new Publication("Evans", "Kasia");
        Publication p2 = new Publication("Tytus", "Waldemar");
        Publication p3 = new Publication("Gory", "Kopernik");
        Publication p4 = new Publication("Gory", "Kopernik");

        // Creating the list which contains the
        // no. of books.

        List<Publication> publications = new ArrayList<>();
        publications.add(p1);
        publications.add(p2);
        publications.add(p3);
        publications.add(p4);

        BookCollection bookCollection = new BookCollection(publications);
        List<Publication> publ = bookCollection.getTotalBooksInCollection();
        System.out.println(p3 == p1);
        System.out.println(p3.equals(p4));
        for(Publication pub : publ ) {
            System.out.println("Title: " + pub.title + " Author: " + pub.author);
        }


    }
}
