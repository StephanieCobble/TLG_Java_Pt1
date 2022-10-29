package com.library.client;

import com.library.Book;
import com.library.BookType;

import java.time.LocalDate;

class BookClient {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookTitle("Harry Potter & the Sorcerer's Stone");
        b1.setAuthor("JKR");
        b1.setIsbn(83722492727L);
        b1.setSeries(true);

        Book b2 = new Book();
        b2.setBookTitle("Small Horrors");
        b2.setAuthor("Darcy Coates");
        b2.setIsbn(2648191736L);
        b2.setSeries(false);

        Book b3 = new Book();
        b3.setBookTitle("Complete Tales & Poems");
        b3.setAuthor("Edgar Allan Poe");
        b3.setIsbn(8291374019L);
        b3.setSeries(false);

        Book b4 = new Book(336, BookType.EBOOK, "Goblin Quest", true, 29303495930L, "Jim C Hines", LocalDate.of(2015,4, 3));

        Book b5 = new Book(224, BookType.PAPERBACK, "Train Journeys of the World", false, 9780749506582L);
//
//        b1.read();
//        b1.shelve();
//        b1.bookLookup();
//        b1.bookSeries();
//
//        System.out.println();
//
//        b2.read();
//        b2.shelve();
//        b2.bookLookup();
//        b2.bookSeries();
//
//        System.out.println();
//
//        b3.read();
//        b3.shelve();
//        b3.bookLookup();
//        b3.bookSeries();
//
//        System.out.println();
//
//        b4.read();
//        b4.shelve();
//        b4.bookLookup();
//        b4.bookSeries();
//
//        System.out.println();
//
//        b5.read();
//        b5.shelve();
//        b5.bookLookup();
//        b5.bookSeries();
//
//        System.out.println();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
