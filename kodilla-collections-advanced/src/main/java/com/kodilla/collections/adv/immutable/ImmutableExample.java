package com.kodilla.collections.adv.immutable;
import com.kodilla.collections.adv.immutable.BookHacked;

public class ImmutableExample {
    public static void main(String[] args) {
Book book = new BookHacked("John Stewart", "The last chance");
BookHacked bookHacked = (BookHacked) book;
bookHacked.modifyTitle("New Title");
bookHacked.modifyAuthor("New Author");
        System.out.println(book.getTitle());
    }
}
