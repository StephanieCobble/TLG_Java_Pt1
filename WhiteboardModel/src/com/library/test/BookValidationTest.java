package com.library.test;

import com.library.Book;

class BookValidationTest {
    public static void main(String[] args) {
        // test [1,1500]; 0,1 & 1500,1501
        Book b1 = new Book();

        b1.setBookLength(1); // pass
        System.out.println("bookLength: " + b1.getBookLength());

        b1.setBookLength(1500); // pass
        System.out.println("bookLength: " + b1.getBookLength());

        b1.setBookLength(0); // fail, keeps last
        System.out.println("bookLength: " + b1.getBookLength());

        b1.setBookLength(1501); //fail, keeps last
        System.out.println("bookLength: " + b1.getBookLength());
    }
}