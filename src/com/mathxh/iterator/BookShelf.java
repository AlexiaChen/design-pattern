package com.mathxh.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public Book indexAt(int index) {
        return books.get(index);
    }
    public void append(Book book) {
        this.books.add(book);

    }
    public int length() {
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
