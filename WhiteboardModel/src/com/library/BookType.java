package com.library;

public enum BookType { // enums usually just Class name. BookType bc type of book platform
    EBOOK("eBook"),
    PAPERBACK("Paperback"),
    HARDCOVER("Hardcover");

    // everything under here is regular class defs (fields, ctors, methods)
    private String bookType;

    //ctor
    BookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public String toString() {
        return getBookType();
    }
}