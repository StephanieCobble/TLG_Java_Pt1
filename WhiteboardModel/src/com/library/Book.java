package com.library;

import java.time.LocalDate;

// Business class
public class Book {

    // static/shared variables
    public static final int MIN_PAGES = 1;
    public static final int MAX_PAGES = 1500;

    // fields or instance variables (properties)
    private String bookTitle;
    private String author;
    private boolean isSeries;
    private long isbn;
    private BookType bookType;
    private int bookLength;
    private LocalDate publishDate;

    // Constructors
    public Book() {
        //no-op
    }

    public Book(int bookLength) {
        setBookLength(bookLength);
    }

    public Book(int bookLength, BookType bookType) {
        this(bookLength);
        setBookType(bookType);
    }

    public Book(int bookLength, BookType bookType, String bookTitle, boolean isSeries, long isbn) {
        this(bookLength, bookType);
        setBookTitle(bookTitle);
        setSeries(isSeries);
        setIsbn(isbn);
    }

    public Book(int bookLength, BookType bookType, String bookTitle, boolean isSeries, long isbn, String author) {
        this(bookLength, bookType, bookTitle, isSeries, isbn);
        setAuthor(author);
        setBookLength(bookLength);
    }

    public Book(int bookLength, BookType bookType, String bookTitle, boolean isSeries, long isbn, String author, LocalDate publishDate) {
        this(bookLength, bookType, bookTitle, isSeries, isbn, author);
        setPublishDate(publishDate);
    }

    // business methods (functions)
    public void read() {
        System.out.println("I will read " + getBookTitle() + " by " + getAuthor() + ".");
    }

    public void shelve() {
        System.out.println("I need to put away " + getBookTitle() + ".");
    }

    public void bookLookup() {
        System.out.println("What's the ISBN for " + getBookTitle() + " by " + getAuthor() + "? It's " + getIsbn() + ".");
    }

    public void bookSeries() {
        System.out.println("Is " + getBookTitle() + " part of a series? " + isSeries());
    }

    //Accessor Methods or Getters & Setters
    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isSeries() {
        return isSeries;
    }

    public void setSeries(boolean series) {
        isSeries = series;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) { //for enum
        this.bookType = bookType;
    }

    public int getBookLength() {
        return bookLength;
    }

    // set book length [1, 1500]
    public void setBookLength(int bookLength) {
        if (bookLength >= MIN_PAGES && bookLength <= MAX_PAGES) {
            this.bookLength = bookLength;
        } else {
            System.out.println("Invalid bookLength: " + bookLength + ". Book length is only support between " +
                    MIN_PAGES + " and " + MAX_PAGES + " pages.");
        }
    }

    // toString
    public String toString() {
        return "Book: bookTitle = " + getBookTitle() + ", author = " + getAuthor() + ", isbn = " +
                getIsbn() + ", isSeries = " + isSeries() + ", bookType = " + getBookType() +
                ", bookLength = " + getBookLength() + ", publishDate = " + getPublishDate();
    }
}