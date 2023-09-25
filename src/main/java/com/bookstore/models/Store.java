package com.bookstore.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Book> bookList;

    public Store() {
        this.bookList = new ArrayList<>();

        Book book = new Book(1,
                "JavaDefault",
                "Default",
                "This is book");
    }

    public void insertBook(Book book) {
        if (book != null) {
            book.setId(this.bookList.size() + 1);
            this.bookList.add(book);
        }
    }

    public List<Book> getBooks() {
        return this.bookList;
    }
}
