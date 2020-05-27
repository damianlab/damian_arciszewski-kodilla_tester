package com.kodilla.collections.adv.immutable.special.homework;

import java.util.*;

public class BookAplication {
    public static void main(String[] args) {

        // Basic list with some titles
        List<Book> books = new ArrayList<>();
        books.add(new Book("Ogniem i mieczem", "H S"));
        books.add(new Book("Pan Tadeusz", "A M"));
        books.add(new Book("Czerwony Kapturek", "B G"));
        books.add(new Book("Lalka", "B P"));

        // Cast
        BookManager bookManager = new BookManager();
        Book b1 = bookManager.createBook("Kamienie na szaniec", "A K");
        Book b2 = bookManager.createBook("Czerwony Kapturek", "B G");
        Book b3 = bookManager.createBook("Lalka", "B P");
        Book b4 = bookManager.createBook("Czerwony Kapturek", "B G");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);


        if (b1 == b2) {
            System.out.println("b1 ma ten sam adres co b2");
        } else {
            System.out.println("b1 ma inny adres niz b2");
        }

        if (b1 == b3) {
            System.out.println("b1 ma ten sam adres co b3");
        } else {
            System.out.println("b1 ma inny adres niz b3");
        }
 /*
        System.out.println("----Next part----");
        System.out.println(books.size());


        System.out.println("----Next part----");

        for(Book book : books)
            System.out.println(book); // book a books
        System.out.println("----Next part counter ----");
        
for (int counter = 0; counter < books.size(); counter++) {
    System.out.println(books.get(counter));
} */

    }
}
