package com.mathxh.Composite;

import java.util.ArrayList;

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

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        dir.forEach(entry -> ((Entry)entry).printList(prefix + "/" + name));
    }
}
