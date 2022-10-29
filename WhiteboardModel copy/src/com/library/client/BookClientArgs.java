package com.library.client;

/*
 *BookClientArgs <bookLength> <bookType>
 */

import com.library.Book;
import com.library.BookType;

import java.time.LocalDate;
import java.util.Arrays;

class BookClientArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            String directions = "Usage: java BookClientArgs <bookLength> <bookType>\n" +
                    "Ex: java BookClientArgs 256 PAPERBACK\n" +
                    "Notes:\n" +
                    " 1. bookLength must be between " + Book.MIN_PAGES + " and " + Book.MAX_PAGES + " pages (inclusive).\n" +
                    " 2. bookType must be " + Arrays.toString(BookType.values()) + ".";
            System.out.println(directions);
            return;
        }

        int bookLength = Integer.parseInt(args[0]);
        BookType bookType = BookType.valueOf(args[1].toUpperCase());

        Book book = new Book(bookLength, bookType);
        book.setBookTitle("Harry Potter & the Sorcerer's Stone");
        book.setAuthor("JKR");
        book.setIsbn(83722492727L);
        book.setSeries(true);
        book.setPublishDate(LocalDate.of(1997, 6, 26));

        System.out.printf("Your book is %s pages and is type = %s!\n", bookLength, bookType);
        System.out.println(book);
    }
}