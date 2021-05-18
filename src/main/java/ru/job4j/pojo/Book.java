package ru.job4j.pojo;

public class Book {

    private String bookName;
    private int pages;

    public Book(String bookName, int pages) {
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
