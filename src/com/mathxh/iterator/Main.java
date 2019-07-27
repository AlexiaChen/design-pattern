package com.mathxh.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.append(new Book("Bible"));
        bookShelf.append(new Book("Harry Potter"));
        bookShelf.append(new Book("Magic Wings"));
        bookShelf.append(new Book("old man and sea"));
        bookShelf.append(new Book("Thinking in java"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
