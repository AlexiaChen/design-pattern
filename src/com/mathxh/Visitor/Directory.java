package com.mathxh.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = dir.stream().mapToInt(entry -> ((Entry) entry).getSize()).sum();
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {
        return dir.iterator();
    }
}
