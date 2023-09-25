package com.bookstore.dao;

import com.bookstore.models.Book;
import com.bookstore.models.Store;

import java.util.List;

public class BookDao {
    private Store bookStore;

    public BookDao() {//getInstance- нужно назвать метод
        this.bookStore = new Store();
    }

    public boolean createBook(Book book) {
        if (book != null) {
            this.bookStore.insertBook(book);
            return true;
        }
        return false;
    }

    public List getListBook() {
        return this.bookStore.getBooks();
    }
}
