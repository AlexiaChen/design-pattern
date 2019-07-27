package com.mathxh.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.length();
    }

    @Override
    public Object next() {
        Book book = this.bookShelf.indexAt(index);
        index++;
        return book;
    }
}
