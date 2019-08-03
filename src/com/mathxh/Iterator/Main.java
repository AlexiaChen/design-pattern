package com.mathxh.Iterator;

/*
*   迭代器模式： 一个一个遍历。 针对对集合类的数据结构容器
*
*/
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
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
