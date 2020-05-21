package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        // New list with all books

        List<Book> booksAdd = new ArrayList<>(books);
        booksAdd.add(bookManager.createBook("Kamienie na szaniec","A K"));
        booksAdd.add(bookManager.createBook("Kamienie na szaniec","A K"));

       //Book book = Book("Ogniem i mieczem", "K F");

        System.out.println(booksAdd.size());
        for(Book book : booksAdd)
           System.out.println(book); // book a books




       // String title = "Pan Tadeusz";
       // String author = "C D";
       // if(books.contains(new Book(title, author))) {
       //     System.out.println(title + " is in the books set.");
       // } else {
       //     System.out.println(title + " is not in the books set.");
      //  }


    }
}
