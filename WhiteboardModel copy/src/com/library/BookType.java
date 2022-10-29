package com.library;

public enum BookType { // enums usually just Class name. BookType bc type of book platform
    EBOOK("eBook"),
    PAPERBACK("Paperback"),
    HARDCOVER("Hardcover");

    // everything under here is regular class defs (fields, ctors, methods)
    private String display;

    //ctor
    BookType(String display) {
        this.display = display;
//        System.out.println("Genre ctor called");
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}