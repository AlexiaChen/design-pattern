package com.mathxh.iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    public Book indexAt(int index) {
        return books[index];
    }
    public void append(Book book) {
        this.books[last] = book;
        last++;
    }
    public int length() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
